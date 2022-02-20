package com.swufe.javaee.thymeleaf;

import com.swufe.javaee.thymeleaf.config.TemplateEngineUtil;
import com.swufe.javaee.thymeleaf.entity.Book;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "BookServlet", value = "/books")
public class BookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        TemplateEngine engine = TemplateEngineUtil.getTemplateEngine(request.getServletContext());
        WebContext context = new WebContext(request, response, request.getServletContext(),
                request.getLocale());
        context.setVariable("book",
                new Book("9527",
                        10.0,
                        "https://img1.doubanio.com/view/subject/s/public/s3267547.jpg",
                        "Head First Servlets and JSP"));
        engine.process("books.html", context, response.getWriter());
    }
}
