package com.example.login3;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class JDBCUtil {
    private static DataSource source;

    private static DataSource getDataSource() throws NamingException {
        if (source == null) {
            InitialContext ctx = new InitialContext();
            source = (DataSource) ctx.lookup("java:comp/env/jdbc/MyDB");
        }
        return source;
    }

    public static Connection getConnection() {
        try {
            DataSource source = JDBCUtil.getDataSource();
            return source.getConnection();
        } catch (NamingException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
