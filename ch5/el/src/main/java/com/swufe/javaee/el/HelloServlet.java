package com.swufe.javaee.el;

import com.swufe.javaee.el.model.Book;
import com.swufe.javaee.el.model.User;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/")
public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Book book = new Book("Gone with the wind", 42.0f);
        User user = new User("Mary", 18, book);
        request.setAttribute("user", user);
        request.setAttribute("name", "Mary");
        request.getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
    }
}