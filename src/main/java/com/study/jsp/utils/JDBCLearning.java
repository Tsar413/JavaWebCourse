package com.study.jsp.utils;

import com.study.jsp.entity.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/*
* // 使用JdbcTemplate的代码
public class JdbcExample {
    private JdbcTemplate jdbcTemplate;

    public JdbcExample(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<User> findUsersByNameAndAge(String name, int age) {
        String sql = "SELECT * FROM users WHERE name = ? AND age = ?";
        return jdbcTemplate.query(sql, new Object[]{name, age}, new UserRowMapper());
    }
}
* */

@Component
public class JDBCLearning {
    private final JdbcTemplate jdbcTemplate;

    public JDBCLearning(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<User> queryTest(){
        String sql = "select * from users;";
        List<User> list = jdbcTemplate.query(sql, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User user = new User();
                user.setId(Integer.valueOf(resultSet.getString("id")));
                user.setUsername(resultSet.getString("username"));
                user.setPasswords(resultSet.getString("passwords"));
                user.setSex(resultSet.getString("sex"));
                user.setEmail(resultSet.getString("email"));
                user.setIntro(resultSet.getString("intro"));
                user.setLan(resultSet.getString("lan"));
                user.setTimes(Integer.valueOf(resultSet.getString("times")));
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                user.setTime(LocalDateTime.parse(resultSet.getString("last_time"), formatter));
                return user;
            }
        });
        return list;
    }

    public String queryTest2(String username, String passwords){
        String sql = "select username from users where username = ? AND passwords = ?;";
        String username1 = "";
        try {
            username1 = jdbcTemplate.queryForObject(sql, new Object[]{username, passwords}, String.class);
        } catch (Exception e){
            return username1;
        }
        return username1;
    }

    public List<String> queryTest3(){
        String sql = "select username from users;";
        List<String> list = jdbcTemplate.query(sql, new RowMapper<String>() {
            @Override
            public String mapRow(ResultSet resultSet, int i) throws SQLException {
                 return resultSet.getString("username");
            }
        });
        return list;
    }
}
