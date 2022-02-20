package com.swufe.javaee.thymeleaf;

import com.swufe.javaee.thymeleaf.config.TemplateEngineUtil;
import com.swufe.javaee.thymeleaf.entity.User;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/")
public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        TemplateEngine engine = TemplateEngineUtil.getTemplateEngine(request.getServletContext());
        WebContext context = new WebContext(request, response, request.getServletContext(),
                request.getLocale());
        response.setCharacterEncoding("UTF-8");
        request.getSession().setAttribute("foo", 42);
        request.getSession().setAttribute("user", "Zhongpu");
        request.setAttribute("bar", 88);
        context.setVariable("name", "Java Web");
        context.setVariable("user", new User("Zhongpu", 30));
        engine.process("home.html", context, response.getWriter());
    }
}