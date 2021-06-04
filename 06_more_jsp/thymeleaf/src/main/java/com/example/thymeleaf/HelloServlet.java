package com.example.thymeleaf;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;
import tleaf.utils.TemplateUtils;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        WebContext wx = new WebContext(request, response, request.getServletContext());
        wx.setVariable("recipient", "Jakarta EE");
        TemplateUtils.process("home", wx);
    }
}