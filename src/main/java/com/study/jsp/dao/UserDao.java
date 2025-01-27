package com.study.jsp.dao;

import com.study.jsp.entity.User;

import java.util.List;

public interface UserDao {
    public String checkUsername(String username);

    public void registrationFunction(String username, String passwords, String email);


    String checkLogin(String username, String password);

    List<User> getPersonInformation(String username);

    Integer getMaxNumber();

    List<User> getLimitPersonInformation(Integer startNumber);
}
