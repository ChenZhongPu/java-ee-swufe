package com.swufe.javaee.mvc1.model;

import com.swufe.javaee.mvc1.bean.Book;
import com.swufe.javaee.mvc1.utils.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Recommendation {

    /**
     * get books whose price is greater than or equal to the price
     * @param price
     * @return
     */
    public List<Book> getBooksGEPrice(double price) throws SQLException, ClassNotFoundException {
        List<Book> books = new ArrayList<>();
        String sql = "SELECT title, price FROM book WHERE price > ?";
        try(Connection connection = DBUtil.getConnection();
                PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setDouble(1, price);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    books.add(new Book(rs.getString("title"),
                            rs.getDouble("price")));
                }
            }
        }
        return books;
    }
}
