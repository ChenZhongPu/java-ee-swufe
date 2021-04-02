package com.swufe.javaee.jsp;

public class Counter {
    private static int count;
    public static int getCount() {
        count++;
        return count;
    }
}
