package com.study.jsp.controller;

import com.study.jsp.service.IDealsService;
import com.study.jsp.service.impl.DealsServiceImpl;

public class DealsController {

    private IDealsService iDealsService = new DealsServiceImpl();

    public Integer addNewProducts(String goodId, String goodName, Double goodPrice, Integer goodCount){
        return iDealsService.addNewProducts(goodId, goodName, goodPrice, goodCount);
    }

    public Integer changeProducts(String goodId, String goodName, Integer goodCount){
        return iDealsService.changeProducts(goodId, goodName, goodCount);
    }
}
