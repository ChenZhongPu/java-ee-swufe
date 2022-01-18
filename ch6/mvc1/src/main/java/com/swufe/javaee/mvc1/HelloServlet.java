package com.swufe.javaee.mvc1;

import com.swufe.javaee.mvc1.bean.Book;
import com.swufe.javaee.mvc1.model.Recommendation;

import java.io.*;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/")
public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            Recommendation recommendation = new Recommendation();
            double price = 15.0;
            List<Book> books = recommendation.getBooksGEPrice(price);
            request.setAttribute("books", books);
            request.getRequestDispatcher("/WEB-INF/books.jsp").forward(request, response);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}