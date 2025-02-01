package com.study.jsp.dao;

import com.study.jsp.entity.ShopCart;

import java.util.List;

public interface DealsDAO {

    List<ShopCart> getActualProduct(String goodId, String goodName);

    Integer getMaxId();

    void addNewProduct(Integer id, String goodId, String goodName, Double goodPrice, Integer goodCount);

    void changeProduct(Integer id, Integer goodCount);

    void deleteActualProduct(Integer id);

}
