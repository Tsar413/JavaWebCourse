package com.study.jsp.controller;

import com.study.jsp.entity.Food;
import com.study.jsp.service.IFoodService;
import com.study.jsp.service.impl.FoodServiceImpl;

import java.util.List;

public class FoodController {

    private IFoodService iFoodService = new FoodServiceImpl();

    public List<Food> getAllFoods(){
        return iFoodService.getAllFoods();
    }
}
