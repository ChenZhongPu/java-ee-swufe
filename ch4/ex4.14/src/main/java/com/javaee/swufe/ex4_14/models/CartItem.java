package com.javaee.swufe.ex4_14.models;

public class CartItem {
    private String bookId;
    private int count;
    private String bookName;

    public CartItem(String bookId, String bookName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.count = 0;
    }

    public void addCount(int add) {
        this.count += add;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getBookId() {
        return bookId;
    }

    public int getCount() {
        return count;
    }

    public String getBookName() {
        return bookName;
    }
}
