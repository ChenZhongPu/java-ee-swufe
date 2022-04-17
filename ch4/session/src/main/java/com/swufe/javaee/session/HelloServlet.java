package com.swufe.javaee.session;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = {"/hello", "/"})
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession(false);

        if (session == null) {
            out.println("This is a new session");
            session = request.getSession();
            session.setAttribute("name", "zhongpu");
            session.setMaxInactiveInterval(10);
        } else {
            out.println("Welcome back");
        }
    }
}