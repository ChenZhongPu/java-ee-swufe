package com.swufe.javaee.orm;

import com.google.gson.Gson;
import com.swufe.javaee.orm.dao.BookDao;
import com.swufe.javaee.orm.entity.Book;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/book")
public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/json");
        PrintWriter out = response.getWriter();

        BookDao bookDao = new BookDao();
        Gson gson = new Gson();
        String json = gson.toJson(bookDao.getBooks());
        out.println(json);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title = req.getParameter("title").trim();
        String isbn = req.getParameter("isbn").trim();
        double price = Double.parseDouble(req.getParameter("price"));

        Book book = new Book(isbn, title, price);
        BookDao bookDao = new BookDao();
        bookDao.addBook(book);

        resp.sendRedirect("index.html");
    }
}