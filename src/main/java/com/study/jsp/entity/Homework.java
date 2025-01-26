package com.study.jsp.entity;

import javax.persistence.*;

@Entity
@Table(name = "Homework")
public class Homework {
    @Id
    @GeneratedValue // 主键 自增
    private Integer id;

    @Column(name = "homework_name", nullable = false, length = 20)
    private String homeworkName;

    @Column(name = "score")
    private Integer score;

    public Homework() {
    }

    public Homework(Integer id, String homeworkName, Integer score) {
        this.id = id;
        this.homeworkName = homeworkName;
        this.score = score;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHomeworkName() {
        return homeworkName;
    }

    public void setHomeworkName(String homeworkName) {
        this.homeworkName = homeworkName;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Homework{" +
                "id=" + id +
                ", homeworkName='" + homeworkName + '\'' +
                ", score=" + score +
                '}';
    }
}
