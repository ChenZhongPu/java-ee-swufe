package com.javaee.swufe.ex4_14;

import com.javaee.swufe.ex4_14.models.Book;
import com.javaee.swufe.ex4_14.models.BookDB;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CartServlet", value = "/cart")
public class CartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TO DO: read the books from session
        // TO DO: and then go to `cart.jsp` to displaying

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String id = request.getParameter("id");
        int amount = Integer.parseInt(request.getParameter("amount"));
        Book book = BookDB.getBookByID(id);
        List<Book> books;
        if (session.getAttribute("books") != null) {
            books = (List<Book>) session.getAttribute("books");
            for (int i = 0; i < amount; i++) {
                books.add(book);
            }
        } else {
            books = new ArrayList<>();
            for (int i = 0; i < amount; i++) {
                books.add(book);
            }
        }
        session.setAttribute("books", books);
        response.sendRedirect("index.html");
    }
}
