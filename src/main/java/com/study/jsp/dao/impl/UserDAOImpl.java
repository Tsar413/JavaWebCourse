package com.study.jsp.dao.impl;

import com.study.jsp.dao.UserDAO;
import com.study.jsp.entity.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Component
public class UserDAOImpl implements UserDAO {
    private final JdbcTemplate jdbcTemplate;

    public UserDAOImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public User findByUsername(String username) {
        String sql = "select * from t_user where username = " + username + ";";
        List<User> list = jdbcTemplate.query(sql, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User user = new User();
                user.setId(Integer.parseInt(resultSet.getString("id")));
                user.setUsername(resultSet.getString("username"));
                user.setRealName(resultSet.getString("realname"));
                user.setPassword(resultSet.getString("password"));
                user.setGender(resultSet.getString("gender"));
                return user;
            }
        });
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public void save(User user) {
        String sql = "insert into t_user(id, username, realname, password, gender) values (?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{user.getId(), user.getUsername(), user.getRealName(),
                user.getPassword(), user.getGender()});
    }

    @Override
    public Integer findBiggestUserId() {
        String sql = "select max(id) from t_user";
        Integer id = jdbcTemplate.queryForObject(sql, Integer.class);
        if(id == null){
            return 1;
        }
        return id + 1;
    }
}
