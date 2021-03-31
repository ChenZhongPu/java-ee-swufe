package com.swufe.javaee.attributes_listeners;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class ZhihuServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<p>Market: " + getServletConfig().getInitParameter("marketEmail") + "</p>");
        out.println("<p>Advertisement: " + getServletConfig().getInitParameter("adEmail") + "</p>");
        out.println("<br/>");
        out.println("<p>Market: " + getInitParameter("marketEmail") + "</p>");
        out.println("<p>Advertisement: " + getInitParameter("adEmail") + "</p>");
        out.println("</body></html>");
    }

}
