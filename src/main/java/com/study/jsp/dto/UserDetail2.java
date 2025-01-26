package com.study.jsp.dto;

public class UserDetail2 {
    private Integer id;

    private String username;

    private Integer times;

    public UserDetail2() {
    }

    public UserDetail2(Integer id, String username, Integer times) {
        this.id = id;
        this.username = username;
        this.times = times;
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

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    @Override
    public String toString() {
        return "UserDetail2{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", times=" + times +
                '}';
    }
}
