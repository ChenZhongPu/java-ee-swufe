package com.example.thymeleaf.model;

public class Beer {
    private double price;
    private String brand;

    public Beer(double price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
