package com.swufe.javaee.session2;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/")
public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        request.getSession();
        PrintWriter out = response.getWriter();
        out.println(SessionListener.getCOUNT() + " people online now.");
    }
}