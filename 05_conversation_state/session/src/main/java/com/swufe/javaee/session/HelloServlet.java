package com.swufe.javaee.session;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        HttpSession session = request.getSession();
        if (session.isNew()) {
            out.println("<h1> This is a new session. </h1>");
        } else {
            out.println("<h1> Welcome back. </h1>");
        }
        out.println("</body></html>");
    }
}