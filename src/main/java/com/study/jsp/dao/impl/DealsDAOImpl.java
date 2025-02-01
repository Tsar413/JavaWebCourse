package com.study.jsp.dao.impl;

import com.study.jsp.dao.DealsDAO;
import com.study.jsp.entity.ShopCart;
import com.study.jsp.utils.SQLConstants;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DealsDAOImpl implements DealsDAO {
    private final JdbcTemplate jdbcTemplate;

    public DealsDAOImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<ShopCart> getActualProduct(String goodId, String goodName) {
        String sql = SQLConstants.GET_ACTUAL_SHOP_CART_SQL;
        List<ShopCart> list = jdbcTemplate.query(sql, new Object[]{goodId, goodName}, new RowMapper<ShopCart>() {
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

    @Override
    public Integer getMaxId() {
        String sql = SQLConstants.GET_MAX_ID_SQL;
        Integer id = jdbcTemplate.queryForObject(sql, Integer.class);
        if(id == null){
            return 1;
        }
        return id + 1;
    }

    @Override
    public void addNewProduct(Integer id, String goodId, String goodName, Double goodPrice, Integer goodCount) {
        String sql = SQLConstants.INSERT_INTO_NEW_PRODUCT_SQL;
        jdbcTemplate.update(sql, new Object[]{id, goodId, goodName, goodPrice, goodCount});
    }

    @Override
    public void changeProduct(Integer id, Integer goodCount) {
        String sql = SQLConstants.UPDATE_PRODUCT_SQL;
        jdbcTemplate.update(sql, new Object[]{goodCount, id});
    }

    @Override
    public void deleteActualProduct(Integer id) {
        String sql = SQLConstants.DELETE_ACTUAL_PRODUCT_SQL + id + ";";
        jdbcTemplate.execute(sql);
    }
}
