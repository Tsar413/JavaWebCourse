package com.study.jsp.dao.impl;

import com.study.jsp.dao.UserDao;
import com.study.jsp.entity.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

public class UserDaoImpl implements UserDao {
    private final JdbcTemplate jdbcTemplate;

    public UserDaoImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public String checkUsername(String username) {
        String sql = "select username from Users where username = ?";
        String username1 = "";
        try {
            username1 = jdbcTemplate.queryForObject(sql, new Object[]{username}, String.class);
        } catch (Exception e){
            return username1;
        }
        return username1;
    }

    @Override
    public void registrationFunction(String username, String passwords, String email) {
        String sql1 = "select max(id) from users";
        Integer userId = jdbcTemplate.queryForObject(sql1, Integer.class);
        if(userId == null){
            userId = 1;
        }
        String sql2 = "insert into users(id,username,passwords,email,times,last_time) values (?,?,?,?,0,?)";
        jdbcTemplate.update(sql2, new Object[]{userId + 1, username, passwords, email, new Date()});
    }

    @Override
    public String checkLogin(String username, String password) {
        String sql1 = "select username from Users where username = ? AND passwords = ?";
        String username1 = "";
        try {
            username1 = jdbcTemplate.queryForObject(sql1, new Object[]{username, password}, String.class);
        } catch (Exception e){
            return "-1";
        }
        String sql2 = "select times from users where username = ?";
        Integer times = jdbcTemplate.queryForObject(sql2, new Object[]{username}, Integer.class);
        if(times == null){
            times = 0;
        }
        String sql3 = "update users set times = ?, last_time = ? where username = ?";
        jdbcTemplate.update(sql3, new Object[]{times + 1, new Date(), username});
        return "1";
    }

    @Override
    public List<User> getPersonInformation(String username){
        String sql = "select * from users where username = ?";
        List<User> list = jdbcTemplate.query(sql,new Object[]{username}, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User user = new User();
                user.setUsername(resultSet.getString("username"));
                user.setTimes(Integer.valueOf(resultSet.getString("times")));
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                user.setTime(LocalDateTime.parse(resultSet.getString("last_time"), formatter));
                return user;
            }
        });
        return list;
    }

    @Override
    public Integer getMaxNumber(){
        String sql1 = "select max(id) from users";
        Integer userId = jdbcTemplate.queryForObject(sql1, Integer.class);
        if(userId == null){
            userId = 0;
        }
        return userId;
    }

    @Override
    public List<User> getLimitPersonInformation(Integer startNumber){
        String sql = "select * from users limit ?,5";
        List<User> list = jdbcTemplate.query(sql,new Object[]{startNumber}, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User user = new User();
                user.setUsername(resultSet.getString("username"));
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
}
