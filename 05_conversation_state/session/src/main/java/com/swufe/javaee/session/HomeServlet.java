package com.swufe.javaee.session;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "HomeServlet", value = "/index")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = (String) request.getSession().getAttribute("user");
        if (user == null) {
            request.setAttribute("name", "Guest");
            request.setAttribute("buttonName", "Sign In");
            request.setAttribute("buttonLink", "sign-in");
        } else {
            request.setAttribute("name", user);
            request.setAttribute("buttonName", "Log Out");
            request.setAttribute("buttonLink", "log-out");
        }
        request.getRequestDispatcher("home.jsp").forward(request, response);
    }
}
