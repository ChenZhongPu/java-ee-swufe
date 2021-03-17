package com.swufe.javaee.myservlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class Hello2Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        Date today = new Date();
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.print("<p>" + today + "</p>");
        out.println("</body></html>");
    }


}
