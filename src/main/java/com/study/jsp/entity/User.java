package com.study.jsp.entity;


import javax.persistence.*;

@Entity
@Table(name = "t_user")
public class User {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "username", nullable = false, length = 40)
    private String username;

    @Column(name = "realname", nullable = false, length = 40)
    private String realName;

    @Column(name = "password", nullable = false, length = 60)
    private String password;

    @Column(name = "gender", nullable = false, length = 4)
    private String gender;

    public User() {
    }

    public User(Integer id, String username, String realName, String password, String gender) {
        this.id = id;
        this.username = username;
        this.realName = realName;
        this.password = password;
        this.gender = gender;
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

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", realName='" + realName + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                '}';
    }
}
