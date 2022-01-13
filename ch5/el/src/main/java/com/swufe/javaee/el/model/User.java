package com.swufe.javaee.el.model;

public class User {
    private String name;
    private int age;
    private Book favourite;

    public User(String name, int age, Book favourite) {
        this.name = name;
        this.age = age;
        this.favourite = favourite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Book getFavourite() {
        return favourite;
    }

    public void setFavourite(Book favourite) {
        this.favourite = favourite;
    }
}
