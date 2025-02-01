package com.study.jsp.dao.impl;

import com.study.jsp.dao.BookDAO;
import com.study.jsp.entity.Book;
import com.study.jsp.utils.SQLConstants;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class BookDAOImpl implements BookDAO {
    private final JdbcTemplate jdbcTemplate;

    public BookDAOImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Book> getAllBooks(){
        String sql = SQLConstants.GET_ALL_BOOKS_SQL;
        List<Book> list = jdbcTemplate.query(sql, new RowMapper<Book>() {
            @Override
            public Book mapRow(ResultSet resultSet, int i) throws SQLException {
                Book book = new Book();
                book.setId(resultSet.getString("b_id"));
                book.setName(resultSet.getString("b_name"));
                book.setPrice(Double.valueOf(resultSet.getString("b_price")));
                book.setAuthor(resultSet.getString("b_author"));
                return book;
            }
        });
        System.out.println(list);
        return list;
    }
}
