package com.study.jsp.dao.impl;

import com.study.jsp.dao.FoodDAO;
import com.study.jsp.entity.Food;
import com.study.jsp.utils.SQLConstants;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class FoodDAOImpl implements FoodDAO {
    private final JdbcTemplate jdbcTemplate;

    public FoodDAOImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Food> getAllFoods(){
        String sql = SQLConstants.GET_ALL_FOODS_SQL;
        List<Food> list = jdbcTemplate.query(sql, new RowMapper<Food>() {
            @Override
            public Food mapRow(ResultSet resultSet, int i) throws SQLException {
                Food food = new Food();
                food.setId(resultSet.getString("f_id"));
                food.setName(resultSet.getString("f_name"));
                food.setPrice(Double.valueOf(resultSet.getString("f_price")));
                return food;
            }
        });
        System.out.println(list);
        return list;
    }
}
