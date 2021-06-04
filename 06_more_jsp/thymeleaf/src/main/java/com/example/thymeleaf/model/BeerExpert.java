package com.example.thymeleaf.model;

import java.util.Arrays;
import java.util.List;

public class BeerExpert {
    public static List<Beer> getBeers() {
        return Arrays.asList(new Beer(10.0, "ABC"),
                new Beer(12.0, "EFG"));
    }
}
