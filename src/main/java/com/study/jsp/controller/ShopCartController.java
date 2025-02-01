package com.study.jsp.controller;

import com.study.jsp.entity.ShopCart;
import com.study.jsp.service.IShopCartService;
import com.study.jsp.service.impl.ShopCartServiceImpl;

import java.util.List;

public class ShopCartController {
    private IShopCartService iShopCartService = new ShopCartServiceImpl();

    public List<ShopCart> getAllProducts(){
        return iShopCartService.getAllProducts();
    }
}
