package com.swufe.javaee.attributes_listeners;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SynServlet1", value = "/syn1")
public class SynServlet1 extends HttpServlet {
    // context attribute is not thread-safe, but it is bad to synchronize the whole service/get/post method.
    @Override
    protected synchronized void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("test context attribute<br/>");

        getServletContext().setAttribute("foo", "22");
        getServletContext().setAttribute("bar", "42");

        // suppose each request has to do a long-time work, and this servlet can only response
        // to one request one time, so this app would be very slow.
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        out.println(getServletContext().getAttribute("foo"));
        out.println(getServletContext().getAttribute("bar"));
    }
}
