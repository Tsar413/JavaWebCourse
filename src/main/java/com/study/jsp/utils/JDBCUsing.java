package com.study.jsp.utils;

import com.study.jsp.entity.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;

public class JDBCUsing {
    private String driver = "com.mysql.cj.jdbc.Driver";//mysql驱动
    private String url ="jdbc:mysql://127.0.0.1:3306/java_web_teaching?allowPublicKeyRetrieval=true&useSSL=false&characterEncoding=UTF-8&serverTimezone=GMT%2B8";//连接地址
    private String user ="root";//用户
    private String password ="123456";//密码

    private DriverManagerDataSource dataSource;

    private JdbcTemplate jdbcTemplate;

    public JDBCUsing() {
        this.dataSource = new DriverManagerDataSource();
        this.dataSource.setUrl(url);
        this.dataSource.setDriverClassName(driver);
        this.dataSource.setUsername(user);
        this.dataSource.setPassword(password);
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<User> queryTest(){
        return new JDBCLearning(jdbcTemplate).queryTest();
    }

    public String queryTest2(String username, String passwords){
        return new JDBCLearning(jdbcTemplate).queryTest2(username, passwords);
    }

    public List<String> queryTest3(){
        return new JDBCLearning(jdbcTemplate).queryTest3();
    }
}
