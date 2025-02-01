package com.study.jsp.entity;

import javax.persistence.*;

@Entity
@Table(name = "t_emp")
public class Employee {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "name", nullable = false, length = 40)
    private String name;

    @Column(name = "salary", columnDefinition = "decimal(7,2)")
    private Double salary;

    @Column(name = "age")
    private Integer age;

    public Employee() {
    }

    public Employee(Integer id, String name, Double salary, Integer age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
