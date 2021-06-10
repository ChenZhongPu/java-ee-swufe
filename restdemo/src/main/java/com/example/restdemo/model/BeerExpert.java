package com.example.restdemo.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BeerExpert {
    public static List<Beer> getBeers() {
        return Arrays.asList(new Beer("A", 11.0), new Beer("B", 12.0));
    }

    public static List<Beer> getBeersByColor(String color) {
        if (color.equals("white")) {
            return Arrays.asList(new Beer("C", 17.0), new Beer("D", 1.0));
        } else {
            return Collections.singletonList(new Beer("E", 2.0));
        }
    }
}
