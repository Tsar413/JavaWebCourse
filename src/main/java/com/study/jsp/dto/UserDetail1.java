package com.study.jsp.dto;

public class UserDetail1 {
    private Integer id;

    private String username;

    public UserDetail1() {
    }

    public UserDetail1(Integer id, String username) {
        this.id = id;
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "UserDetail1{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }
}
