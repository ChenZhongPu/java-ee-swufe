package com.swufe.javaee.attributes_listeners;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SynServlet2", value = "/syn2")
public class SynServlet2 extends HttpServlet {
    // synchronize context or session itself
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("test context attribute<br/>");

        synchronized (getServletContext()) {
            getServletContext().setAttribute("foo", "22");
            getServletContext().setAttribute("bar", "42");
            out.println(getServletContext().getAttribute("foo"));
            out.println(getServletContext().getAttribute("bar"));
        }

        out.println("<br/>test session attribute<br/>");
        HttpSession session = request.getSession();
        synchronized (session) {
            session.setAttribute("foo", "session-22");
            session.setAttribute("bar", "session-42");
            out.println(session.getAttribute("foo"));
            out.println(session.getAttribute("bar"));
        }
    }
}
