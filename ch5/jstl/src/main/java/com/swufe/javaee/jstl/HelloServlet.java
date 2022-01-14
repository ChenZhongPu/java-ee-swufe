package com.swufe.javaee.jstl;

import java.io.*;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/")
public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String[] books = {"Gone with the Wind", "The Great Gatsby",
                "1587, a Year of No Significance"};
        request.setAttribute("bookArray", books);

        request.setAttribute("balance", 100);

        request.setAttribute("name", "Mary");

        Map<String, Integer> bookCount = new HashMap<>();
        bookCount.put("Gone with the Wind", 42);
        bookCount.put("The Great Gatsby", 100);
        bookCount.put("1587, a Year of No Significance", 130);
        request.setAttribute("bookCount", bookCount);

        List<String> programmings = Arrays.asList("C", "C++", "Java", "Python");
        List<String> sports = Arrays.asList("Running", "Basketball", "Football");
        List<List<String>> skills = new ArrayList<>();
        skills.add(programmings);
        skills.add(sports);
        request.setAttribute("skills", skills);

        request.getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
    }
}