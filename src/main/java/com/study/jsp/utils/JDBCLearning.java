package com.study.jsp.utils;

import com.study.jsp.dto.UserDetail1;
import com.study.jsp.dto.UserDetail2;
import com.study.jsp.entity.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
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

    public List<UserDetail1> queryTest4(){
        String sql = "select id, username from users;";
        List<UserDetail1> list = jdbcTemplate.query(sql, new RowMapper<UserDetail1>() {
            @Override
            public UserDetail1 mapRow(ResultSet resultSet, int i) throws SQLException {
                UserDetail1 user = new UserDetail1();
                user.setId(Integer.valueOf(resultSet.getString("id")));
                user.setUsername(resultSet.getString("username"));
                return user;
            }
        });
        return list;
    }

    public List<UserDetail2> queryTest5(){
        String sql = "select id, username, times from users;";
        List<UserDetail2> list = jdbcTemplate.query(sql, new RowMapper<UserDetail2>() {
            @Override
            public UserDetail2 mapRow(ResultSet resultSet, int i) throws SQLException {
                UserDetail2 user = new UserDetail2();
                user.setId(Integer.valueOf(resultSet.getString("id")));
                user.setUsername(resultSet.getString("username"));
                user.setTimes(Integer.valueOf(resultSet.getString("times")));
                return user;
            }
        });
        return list;
    }

    public Integer queryTest6(){
        String sql = "select max(id) from users;";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    public String queryTest7(){
        String sql = "select passwords from users where username = 'a';";
        return jdbcTemplate.queryForObject(sql, String.class);
    }

    public List<String> queryTest8(Integer times){
        String sql = "select username from users where times = ?;";
        List<String> list = jdbcTemplate.query(sql, new Object[]{times}, new RowMapper<String>() {
            @Override
            public String mapRow(ResultSet resultSet, int i) throws SQLException {
                return resultSet.getString("username");
            }
        });
        return list;
    }

    public void executeInsert1(){
        String sql = "insert into users(id,username,passwords,sex,times,last_time) values (3,'c','123456','男',0,'2025-01-25 21:30:00')";
        jdbcTemplate.execute(sql);
    }

    public void executeUpdate1(){
        String sql = "update users set passwords = '123' where id = 3";
        jdbcTemplate.execute(sql);
    }

    public void executeDelete1(){
        String sql = "delete from users where id = 3";
        jdbcTemplate.execute(sql);
    }

    public void executeInsert2(){
        String sql = "insert into users(id,username,passwords,sex,times,last_time) values (3,'c','123','男',0,'2025-01-25 21:30:00')";
        jdbcTemplate.update(sql);
    }

    public void executeUpdate2(){
        String sql = "update users set passwords = '123456' where id = 3";
        jdbcTemplate.update(sql);
    }

    public void executeInsert3(String username, String passwords){
        String sql = "insert into users(id,username,passwords,sex,times,last_time) values (4,?,?,'男',0,?)";
        jdbcTemplate.update(sql, new Object[]{username, passwords, new Date()});
    }

    public void executeUpdate3(String username, String passwords){
        String sql = "update users set passwords = ? where username = ?";
        jdbcTemplate.update(sql, new Object[]{passwords, username});
    }
}
