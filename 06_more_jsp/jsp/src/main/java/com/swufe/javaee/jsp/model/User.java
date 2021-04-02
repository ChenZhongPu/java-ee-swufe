package com.swufe.javaee.jsp.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<String> hobbies;

    public User(String name) {
        this.name = name;
        hobbies = new ArrayList<>();
    }

    public void addHobby(String hobby) {
        hobbies.add(hobby);
    }
}
