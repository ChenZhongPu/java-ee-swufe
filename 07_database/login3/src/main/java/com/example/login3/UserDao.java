package com.example.login3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    public boolean login(User user) {
        String sql = "select * from users where name = ? and pwd = ?";
        try (Connection connection = JDBCUtil.getConnection()) {
            if (connection == null) {
                return false;
            }
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, user.getName());
            statement.setString(2, user.getPwd());

            ResultSet resultSet = statement.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            return false;
        }
    }
}
