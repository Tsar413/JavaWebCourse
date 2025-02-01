package com.study.jsp.dao.impl;

import com.study.jsp.dao.ShopCartDAO;
import com.study.jsp.entity.ShopCart;
import com.study.jsp.utils.SQLConstants;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ShopCartDAOImpl implements ShopCartDAO {
    private final JdbcTemplate jdbcTemplate;

    public ShopCartDAOImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<ShopCart> getAllProducts() {
        String sql = SQLConstants.GET_ALL_SHOP_CART_SQL;
        List<ShopCart> list = jdbcTemplate.query(sql, new RowMapper<ShopCart>() {
            @Override
            public ShopCart mapRow(ResultSet resultSet, int i) throws SQLException {
                ShopCart cart = new ShopCart();
                cart.setId(Integer.valueOf(resultSet.getString("id")));
                cart.setGoodId(resultSet.getString("good_id"));
                cart.setGoodName(resultSet.getString("good_name"));
                cart.setGoodPrice(Double.valueOf(resultSet.getString("good_price")));
                cart.setGoodCount(Integer.valueOf(resultSet.getString("good_count")));
                return cart;
            }
        });
        System.out.println(list);
        return list;
    }
}
