package com.swufe.javaee.session;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "HomeServlet", value = "/home")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session.getAttribute("name") == null) {
            request.setAttribute("name", "Guest");
        } else {
           request.setAttribute("name", session.getAttribute("name"));
        }
        request.getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
    }
}
