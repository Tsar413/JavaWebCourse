package com.study.jsp.service;

import com.study.jsp.entity.User;

public interface UserService {

    // 用户注册
    void register(User user);

    User login(String username, String password);
}
