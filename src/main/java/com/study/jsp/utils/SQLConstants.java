package com.study.jsp.utils;

public class SQLConstants {
    public static final String GET_ALL_BOOKS_SQL = "select * from book;";

    public static final String GET_ALL_SHOP_CART_SQL = "select * from t_car;";

    public static final String GET_ACTUAL_SHOP_CART_SQL = "select * from t_car where good_id = ? AND good_name = ?;";

    public static final String GET_MAX_ID_SQL = "select MAX(id) from t_car;";

    public static final String INSERT_INTO_NEW_PRODUCT_SQL = "insert into t_car(id, good_id, good_name," +
            "good_price, good_count) values (?,?,?,?,?);";

    public static final String UPDATE_PRODUCT_SQL = "update t_car set good_count = ? where id = ?;";

    public static final String DELETE_ACTUAL_PRODUCT_SQL = "delete from t_car where id = ";

    public static final String GET_ALL_FOODS_SQL = "select * from food;";

}
