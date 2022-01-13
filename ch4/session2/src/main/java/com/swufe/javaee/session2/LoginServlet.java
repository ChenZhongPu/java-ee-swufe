package com.swufe.javaee.session2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session.getAttribute("user") == null) {
            request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        } else {
            // already logged
            response.sendRedirect("home");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        HttpSession session = request.getSession();
        // in real systems, the user should be obtained from databases.
        session.setAttribute("user", new ActiveUser(name, 18));
        response.sendRedirect("home");
    }
}
