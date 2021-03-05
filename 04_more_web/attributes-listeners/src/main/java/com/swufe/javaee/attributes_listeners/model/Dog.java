package com.swufe.javaee.attributes_listeners.model;
import javax.servlet.http.*;

public class Dog implements HttpSessionBindingListener {
    private String breed;

    public Dog(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        // when the `request.getSession().setAttribute("dog", dog)` is called, this callback is also called.
        System.out.println("----- The dog object is added into a session -----");
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {

    }
}
