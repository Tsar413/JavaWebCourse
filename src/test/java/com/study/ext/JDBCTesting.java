package com.study.ext;

import com.study.jsp.utils.JDBCLearning;
import com.study.jsp.utils.JDBCUsing;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JDBCTesting {
    public static void main(String[] args) {
        JDBCUsing jdbcUsing = new JDBCUsing();
        System.out.println(jdbcUsing.queryTest());
        System.out.println(jdbcUsing.queryTest2("a", "123456"));
        System.out.println(jdbcUsing.queryTest3());
    }
}
