package com.swufe.javaee.mvc2.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        String database = "/home/zhongpu/github/java-ee-swufe/ch6/test.db";
        return DriverManager.getConnection("jdbc:sqlite:" + database);
    }
}
