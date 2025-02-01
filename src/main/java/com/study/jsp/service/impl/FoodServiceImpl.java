package com.study.jsp.service.impl;

import com.study.jsp.dao.DatabaseResource;
import com.study.jsp.dao.FoodDAO;
import com.study.jsp.dao.impl.FoodDAOImpl;
import com.study.jsp.entity.Food;
import com.study.jsp.service.IFoodService;

import javax.annotation.Resource;
import java.util.List;

public class FoodServiceImpl implements IFoodService {
    @Resource
    private FoodDAO bookDAO = new FoodDAOImpl(new DatabaseResource().getJdbcTemplate());

    @Override
    public List<Food> getAllFoods() {
        return bookDAO.getAllFoods();
    }
}
