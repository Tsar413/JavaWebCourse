package com.study.jsp.dto;

public class Shop {
    private String productName;

    private String introduction;

    private Double price;

    private Integer storage;

    private Integer sales;

    public Shop() {
    }

    public Shop(String productName, String introduction, Double price, Integer storage, Integer sales) {
        this.productName = productName;
        this.introduction = introduction;
        this.price = price;
        this.storage = storage;
        this.sales = sales;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStorage() {
        return storage;
    }

    public void setStorage(Integer storage) {
        this.storage = storage;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "productName='" + productName + '\'' +
                ", introduction='" + introduction + '\'' +
                ", price=" + price +
                ", storage=" + storage +
                ", sales=" + sales +
                '}';
    }
}
