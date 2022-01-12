package com.swufe.javaee.response;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Forward4Servlet", value = "/forward4")
public class Forward4Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("write something");
        out.flush();
        request.getRequestDispatcher("json").forward(request, response);
        out.close();
    }
}
