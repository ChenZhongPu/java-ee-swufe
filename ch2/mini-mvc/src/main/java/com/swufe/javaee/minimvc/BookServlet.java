package com.swufe.javaee.minimvc;

import com.swufe.javaee.minimvc.model.Recommendation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

//@WebServlet(name = "BookServlet", value = "/book")
@WebServlet(urlPatterns = "/book")
public class BookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String book = request.getParameter("books");
        List<String> books = new Recommendation().getBooks(book);
        request.setAttribute("books", books);
        RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
