package com.javaee.swufe.ex4_14;

import com.javaee.swufe.ex4_14.models.Book;
import com.javaee.swufe.ex4_14.models.BookDB;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "BookServlet", value = "/book")
public class BookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        Book book = BookDB.getBookByID(id);
        request.setAttribute("book", book);
        request.getRequestDispatcher("/WEB-INF/book.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
