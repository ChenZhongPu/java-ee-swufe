package com.swufe.javaee.thymeleaf.entity;

public class Book {
    private String isbn;
    private double price;
    private String image;
    private String title;

    public Book(String isbn, double price, String image, String title) {
        this.isbn = isbn;
        this.price = price;
        this.image = image;
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
