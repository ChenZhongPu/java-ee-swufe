package com.swufe.javaee.session;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session.getAttribute("email") == null) {
           request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        } else {
            // already logged
            response.sendRedirect("home");
//            response.sendRedirect(response.encodeRedirectURL("home"));
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        HttpSession session = request.getSession();
        session.setAttribute("email", email);
        response.sendRedirect("home");
//        response.sendRedirect(response.encodeRedirectURL("home"));
    }
}
