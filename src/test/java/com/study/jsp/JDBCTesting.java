package com.study.jsp;

import com.study.jsp.utils.JDBCUsing;

public class JDBCTesting {
    public static void main(String[] args) {
        JDBCUsing jdbcUsing = new JDBCUsing();
        System.out.println(jdbcUsing.queryTest());
        System.out.println(jdbcUsing.queryTest2("a", "123456"));
        System.out.println(jdbcUsing.queryTest3());
        System.out.println(jdbcUsing.queryTest4());
        System.out.println(jdbcUsing.queryTest5());
        System.out.println(jdbcUsing.queryTest6());
        System.out.println(jdbcUsing.queryTest7());
        System.out.println(jdbcUsing.queryTest8(2));
        jdbcUsing.execute();
    }
}
