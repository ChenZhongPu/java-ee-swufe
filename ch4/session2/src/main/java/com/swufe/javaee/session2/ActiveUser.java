package com.swufe.javaee.session2;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import java.util.concurrent.atomic.AtomicInteger;

public class ActiveUser implements HttpSessionBindingListener {
    private String name;
    private int age;

    private static final AtomicInteger COUNT = new AtomicInteger(0);

    public ActiveUser(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        COUNT.incrementAndGet();
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        COUNT.decrementAndGet();
    }

    public static int getCOUNT() {
        return COUNT.get();
    }
}
