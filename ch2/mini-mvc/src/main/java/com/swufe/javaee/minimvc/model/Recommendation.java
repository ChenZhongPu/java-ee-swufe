package com.swufe.javaee.minimvc.model;

import java.util.ArrayList;
import java.util.List;

public class Recommendation {
    public List<String> getBooks(String genre) {
        List<String> result = new ArrayList<>();
        if (genre.equals("novel")) {
            result.add("The Great Gatsby");
            result.add("Gone with the Wind");
        } else if (genre.equals("history")) {
            result.add("1587, a Year of No Significance");
        } else if (genre.equals("math")) {
            result.add("The Linear Algebra Survival Guide");
        } else if (genre.equals("programming")) {
            result.add("Head First Java Web");
            result.add("Effective Java");
        }
        return result;
    }
}
