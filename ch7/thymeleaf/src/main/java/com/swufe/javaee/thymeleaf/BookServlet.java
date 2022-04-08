package com.swufe.javaee.thymeleaf;

import com.swufe.javaee.thymeleaf.config.TemplateEngineUtil;
import com.swufe.javaee.thymeleaf.entity.Book;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "BookServlet", value = "/books")
public class BookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        TemplateEngine engine = TemplateEngineUtil.getTemplateEngine(request.getServletContext());
        WebContext context = new WebContext(request, response, request.getServletContext(),
                request.getLocale());
        context.setVariable("book",
                new Book(id,
                        new Random().nextInt(100) + 5,
                        "https://source.unsplash.com/random/200x200?sig=1",
                        "Head First Java Web"));
        engine.process("books.html", context, response.getWriter());
    }
}
