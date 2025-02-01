package com.study.jsp.entity;

import javax.persistence.*;

@Entity
@Table(name = "Book")
public class Book {
    @Id
    @GeneratedValue
    @Column(name = "b_id", nullable = false, length = 50)
    private String id;

    @Column(name = "b_name", nullable = false, length = 50)
    private String name;

    @Column(name = "b_price", nullable = false)
    private Double price;

    @Column(name = "b_author", nullable = false, length = 50)
    private String author;

    public Book() {
    }

    public Book(String id, String name, Double price, String author) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.author = author;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}
