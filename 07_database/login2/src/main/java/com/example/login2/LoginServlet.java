package com.example.login2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("uname").trim();
        String pwd = request.getParameter("psw").trim();

        User user = new User(name, pwd);

        UserDao userDao = new UserDao();

        if (userDao.login(user)) {
            response.sendRedirect("ok.html");
        } else {
           response.sendRedirect("err.html");
        }

    }
}
