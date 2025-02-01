package com.study.jsp.service.impl;

import com.study.jsp.dao.DatabaseResource;
import com.study.jsp.dao.DealsDAO;
import com.study.jsp.dao.impl.DealsDAOImpl;
import com.study.jsp.entity.ShopCart;
import com.study.jsp.service.IDealsService;

import java.util.List;

public class DealsServiceImpl implements IDealsService {

    private DealsDAO dealsDAO = new DealsDAOImpl(new DatabaseResource().getJdbcTemplate());

    @Override
    public Integer addNewProducts(String goodId, String goodName, Double goodPrice, Integer goodCount) {
        List<ShopCart> product = dealsDAO.getActualProduct(goodId, goodName);
        if(goodCount == 0){
            return 0;
        }
        if(product.isEmpty()){
            try {
                Integer id = dealsDAO.getMaxId();
                dealsDAO.addNewProduct(id, goodId, goodName, goodPrice, goodCount);
            } catch (Exception e) {
                return 0;
            }
        } else {
            try {
                dealsDAO.changeProduct(product.get(0).getId(), goodCount + product.get(0).getGoodCount());
            } catch (Exception e) {
                return 0;
            }
        }
        return 1;
    }

    @Override
    public Integer changeProducts(String goodId, String goodName, Integer goodCount) {
        List<ShopCart> product = dealsDAO.getActualProduct(goodId, goodName);
        if(product.isEmpty()){
            return 0;
        } else {
            if(goodCount == 0){
                try {
                    dealsDAO.deleteActualProduct(product.get(0).getId());
                } catch (Exception e) {
                    return 0;
                }
            } else {
                try {
                    dealsDAO.changeProduct(product.get(0).getId(), goodCount);
                } catch (Exception e) {
                    return 0;
                }
            }
        }
        return 1;
    }

}
