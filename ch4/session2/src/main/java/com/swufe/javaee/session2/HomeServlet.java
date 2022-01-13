package com.swufe.javaee.session2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HomeServlet", value = "/home")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String name = "Guest";
        if (session.getAttribute("user") != null) {
            ActiveUser user = (ActiveUser) session.getAttribute("user");
            name = user.getName();
        }
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Hello "  + name);
        int count = ActiveUser.getCOUNT();
        out.println("; there are " + count + " logged in.");
    }
}
