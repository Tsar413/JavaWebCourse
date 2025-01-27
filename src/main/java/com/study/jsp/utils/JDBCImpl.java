package com.study.jsp.utils;

import com.study.jsp.dao.impl.UserDaoImpl;
import com.study.jsp.entity.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;

public class JDBCImpl {
    private String driver = "com.mysql.cj.jdbc.Driver";//mysql驱动
    private String url ="jdbc:mysql://127.0.0.1:3306/java_web_teaching?allowPublicKeyRetrieval=true&useSSL=false&characterEncoding=UTF-8&serverTimezone=GMT%2B8";//连接地址
    private String user ="root";//用户
    private String password ="123456";//密码

    private DriverManagerDataSource dataSource;

    private JdbcTemplate jdbcTemplate;

    public JDBCImpl() {
        this.dataSource = new DriverManagerDataSource();
        this.dataSource.setUrl(url);
        this.dataSource.setDriverClassName(driver);
        this.dataSource.setUsername(user);
        this.dataSource.setPassword(password);
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public String checkUsername(String username){
        return new UserDaoImpl(jdbcTemplate).checkUsername(username);
    }

    public void registrationFunction(String username, String passwords, String email){
        new UserDaoImpl(jdbcTemplate).registrationFunction(username, passwords, email);
    }

    public String checkLogin(String username, String password){
        return new UserDaoImpl(jdbcTemplate).checkLogin(username, password);
    }

    public List<User> getPersonInformation(String username){
        return new UserDaoImpl(jdbcTemplate).getPersonInformation(username);
    }

    public Integer getMaxNumber(){
        return new UserDaoImpl(jdbcTemplate).getMaxNumber();
    }

    public List<User> getLimitPersonInformation(Integer startNumber){
        return new UserDaoImpl(jdbcTemplate).getLimitPersonInformation(startNumber);
    }
}
