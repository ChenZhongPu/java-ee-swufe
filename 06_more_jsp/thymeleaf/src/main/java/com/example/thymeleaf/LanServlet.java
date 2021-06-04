package com.example.thymeleaf;

import org.thymeleaf.context.WebContext;
import tleaf.utils.TemplateUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LanServlet", value = "/lan")
public class LanServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        WebContext wx = new WebContext(request, response, request.getServletContext(), request.getLocale());
        TemplateUtils.process("lan", wx);
    }
}
