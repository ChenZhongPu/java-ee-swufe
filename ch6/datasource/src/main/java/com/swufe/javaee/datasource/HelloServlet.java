package com.swufe.javaee.datasource;

import com.google.gson.Gson;
import com.swufe.javaee.datasource.bean.Book;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.sql.DataSource;

@WebServlet(name = "helloServlet", value = "/hello")
public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();

        double price = 15.0;
        DataSource dataSource = (DataSource) request.getServletContext().getAttribute("datasource");
        String sql = "SELECT title, price FROM book WHERE price > ?";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)
        ) {
           stmt.setDouble(1, price);
           try (ResultSet rs = stmt.executeQuery()) {
               List<Book> books = new ArrayList<>();
               while (rs.next()) {
                   books.add(new Book(rs.getString("title"),
                           rs.getDouble("price")));
               }
               Gson gson = new Gson();
               out.println(gson.toJson(books));
           }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}