package com.study.jsp.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue // 主键 自增
    private Integer id;

    @Column(name = "username", nullable = false, length = 50) // 设置列名为username 非空 长度为50
    private String username;

    @Column(name = "passwords", nullable = false, length = 50)
    private String passwords;

    @Column(name = "sex", length = 10) // 设置列名为sex 长度为10
    private String sex;

    @Column(name = "email", length = 50)
    private String email;

    @Column(name = "lan", length = 50)
    private String lan;

    @Column(name = "intro", length = 100)
    private String intro;

    @Column(name = "times")
    private Integer times;

    @Column(name = "lastTime", length = 8)
    private LocalDateTime time;

    public User() {
    }

    public User(Integer id, String username, String passwords, String sex, String email, String lan, String intro, Integer times, LocalDateTime time) {
        this.id = id;
        this.username = username;
        this.passwords = passwords;
        this.sex = sex;
        this.email = email;
        this.lan = lan;
        this.intro = intro;
        this.times = times;
        this.time = time;
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

    public String getPasswords() {
        return passwords;
    }

    public void setPasswords(String passwords) {
        this.passwords = passwords;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLan() {
        return lan;
    }

    public void setLan(String lan) {
        this.lan = lan;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", passwords='" + passwords + '\'' +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                ", lan='" + lan + '\'' +
                ", intro='" + intro + '\'' +
                ", times=" + times +
                ", time=" + time +
                '}';
    }
}
