package com.swufe.javaee.init;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Init3Servlet", value = "/init3")
public class Init3Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String path = getServletContext().getInitParameter("path");
        response.getWriter().println(path);
    }
}
