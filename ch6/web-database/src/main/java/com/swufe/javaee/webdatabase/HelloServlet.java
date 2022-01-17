package com.swufe.javaee.webdatabase;

import com.swufe.javaee.webdatabase.bean.Book;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/")
public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        double price = 15.0;
        String sql = "SELECT title, price FROM book WHERE price > ?";
        Connection conn = (Connection) request.getServletContext().getAttribute("database");
        try(PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setDouble(1, price);
            try(ResultSet rs = stmt.executeQuery()) {
                List<Book> books = new ArrayList<>();
                while (rs.next()) {
                    books.add(new Book(rs.getString("title"),
                            rs.getDouble("price")));
                }
                request.setAttribute("books", books);
                request.getRequestDispatcher("/WEB-INF/books.jsp").forward(request, response);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            response.sendError(500);
        }
    }
}