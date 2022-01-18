package com.swufe.javaee.mvc2.dao;

import com.swufe.javaee.mvc2.entity.Book;
import com.swufe.javaee.mvc2.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDao {
    public List<Book> getAllBooks() throws SQLException, ClassNotFoundException {
        List<Book> books = new ArrayList<>();
        String sql = "SELECT title, price FROM book";
        try (Connection connection = DBUtil.getConnection();
                PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()
        ) {
            while (rs.next()) {
                books.add(new Book(rs.getString("title"),
                        rs.getDouble("price")));
            }
        }
        return books;
    }
}
