package com.study.jsp.dao;

import com.study.jsp.entity.User;

public interface UserDAO {
    //根据用户名查询用户
    User findByUsername(String username);
    //注册用户
    void save(User user);

    Integer findBiggestUserId();
}
