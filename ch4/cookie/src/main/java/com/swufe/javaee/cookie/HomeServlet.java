package com.swufe.javaee.cookie;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "HomeServlet", value = {"/home", "/"})
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("name", "Guest");
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : request.getCookies()) {
                if (cookie.getName().equals("name")) {
                    request.setAttribute("name", cookie.getValue());
                    break;
                }
            }
        }
        request.getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
    }
}
