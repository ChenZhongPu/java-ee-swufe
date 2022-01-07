package com.swufe.javaee.response;

import com.google.gson.Gson;
import com.swufe.javaee.response.model.Book;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Json2Servlet", value = "/json2")
public class Json2Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();

        Book book = new Book("Gone with the wind", 29.0f, "Margaret Mitchell");
        Gson gson = new Gson();
        String json = gson.toJson(book);
        out.println(json);
    }
}
