package com.swufe.javaee.init;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Init4Servlet", value = "/init4")
public class Init4Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String path1 = getInitParameter("path");
        String path2 = getServletConfig().getInitParameter("path");
        PrintWriter out = response.getWriter();
        out.println(path1);
        out.println(path2);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
