package com.study.jsp.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DatabaseResource {
    private String driver = "com.mysql.cj.jdbc.Driver";//mysql驱动
    private String url ="jdbc:mysql://127.0.0.1:3306/java_web_teaching?allowPublicKeyRetrieval=true&useSSL=false&characterEncoding=UTF-8&serverTimezone=GMT%2B8";//连接地址
    private String user ="root";//用户
    private String password ="123456";//密码

    private DriverManagerDataSource dataSource;

    private JdbcTemplate jdbcTemplate;

    public DatabaseResource() {
        this.dataSource = new DriverManagerDataSource();
        this.dataSource.setUrl(url);
        this.dataSource.setDriverClassName(driver);
        this.dataSource.setUsername(user);
        this.dataSource.setPassword(password);
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public JdbcTemplate getJdbcTemplate(){
        return this.jdbcTemplate;
    }
}
