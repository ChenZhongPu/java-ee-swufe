package com.example.restdemo.model;

public class Person{
   private String name;
   private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "This is " + this.name;
    }
}
