package com.study.jsp.service.impl;

import com.study.jsp.dao.DatabaseResource;
import com.study.jsp.dao.ShopCartDAO;
import com.study.jsp.dao.impl.ShopCartDAOImpl;
import com.study.jsp.entity.ShopCart;
import com.study.jsp.service.IShopCartService;

import java.util.List;

public class ShopCartServiceImpl implements IShopCartService {
    private ShopCartDAO shopCartDAO = new ShopCartDAOImpl(new DatabaseResource().getJdbcTemplate());

    @Override
    public List<ShopCart> getAllProducts() {
        return shopCartDAO.getAllProducts();
    }
}
