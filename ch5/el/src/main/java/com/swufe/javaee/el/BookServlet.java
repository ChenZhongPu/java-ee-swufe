package com.swufe.javaee.el;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "BookServlet", value = "/book")
public class BookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] books = {"Gone with the Wind", "The Great Gatsby",
                "1587, a Year of No Significance"};
        request.setAttribute("bookArray", books);

        Map<String, Integer> bookCount = new HashMap<>();
        bookCount.put("Gone with the Wind", 42);
        bookCount.put("The Great Gatsby", 100);
        bookCount.put("1587, a Year of No Significance", 130);
        request.setAttribute("bookCount", bookCount);

        request.getRequestDispatcher("/WEB-INF/book.jsp").forward(request, response);
    }
}
