package com.swufe.javaee.mvc2.servlet;

import com.swufe.javaee.mvc2.entity.Book;
import com.swufe.javaee.mvc2.service.BookService;

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
            BookService bookService = new BookService();
            List<Book> books = bookService.getBooksOnNewYear();
            request.setAttribute("books", books);
            request.getRequestDispatcher("/WEB-INF/books.jsp").forward(request, response);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}