package com.study.jsp.entity;

import javax.persistence.*;

@Entity
@Table(name = "t_car")
public class ShopCart {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "good_id", nullable = false, length = 50)
    private String goodId;

    @Column(name = "good_name", nullable = false, length = 50)
    private String goodName;

    @Column(name = "good_price", nullable = false)
    private Double goodPrice;

    @Column(name = "good_count", nullable = false)
    private Integer goodCount;

    public ShopCart() {
    }

    public ShopCart(Integer id, String goodId, String goodName, Double goodPrice, Integer goodCount) {
        this.id = id;
        this.goodId = goodId;
        this.goodName = goodName;
        this.goodPrice = goodPrice;
        this.goodCount = goodCount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodId() {
        return goodId;
    }

    public void setGoodId(String goodId) {
        this.goodId = goodId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public Double getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(Double goodPrice) {
        this.goodPrice = goodPrice;
    }

    public Integer getGoodCount() {
        return goodCount;
    }

    public void setGoodCount(Integer goodCount) {
        this.goodCount = goodCount;
    }

    @Override
    public String toString() {
        return "ShopCart{" +
                "id=" + id +
                ", goodId='" + goodId + '\'' +
                ", goodName='" + goodName + '\'' +
                ", goodPrice=" + goodPrice +
                ", goodCount=" + goodCount +
                '}';
    }
}
