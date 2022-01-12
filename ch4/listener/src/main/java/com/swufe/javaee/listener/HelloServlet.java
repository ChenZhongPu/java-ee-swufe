package com.swufe.javaee.listener;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        DatabaseConn conn = (DatabaseConn) getServletContext().getAttribute("database");
        out.println(conn.getConn());
        out.println(conn.getName());
    }

    public void destroy() {
    }
}