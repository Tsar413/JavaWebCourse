package com.study.jsp.entity;

import javax.persistence.*;

@Entity
@Table(name = "Food")
public class Food {
    @Id
    @GeneratedValue
    @Column(name = "f_id", nullable = false, length = 50)
    private String id;

    @Column(name = "f_name", nullable = false, length = 50)
    private String name;

    @Column(name = "f_price", nullable = false)
    private Double price;

    public Food() {
    }

    public Food(String id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
