package com.example.request;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/book")
public class BookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] reads = request.getParameterValues("read");
        String agent = request.getHeader("User-Agent");
        try {
            int age = Integer.parseInt(request.getParameter("age"));
            request.getRequestDispatcher("ok.html").forward(request, response);
        } catch (NumberFormatException e) {
            request.getRequestDispatcher("error.html").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("this is post");
    }
}
