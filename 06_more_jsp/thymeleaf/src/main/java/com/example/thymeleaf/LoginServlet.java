package com.example.thymeleaf;

import org.thymeleaf.context.WebContext;
import tleaf.utils.Leaf;
import tleaf.utils.TemplateUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        WebContext wx = new WebContext(request, response, request.getServletContext());
        TemplateUtils.process("login", wx);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        
    }
}
