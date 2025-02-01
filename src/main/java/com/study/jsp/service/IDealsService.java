package com.study.jsp.service;

import com.study.jsp.entity.ShopCart;

import java.util.List;

public interface IDealsService {
    Integer addNewProducts(String goodId, String goodName, Double goodPrice, Integer goodCount);

    Integer changeProducts(String goodId, String goodName, Integer goodCount);

}
