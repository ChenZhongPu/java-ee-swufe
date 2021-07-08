package com.example.login;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@WebListener
public class AppListener implements ServletContextListener {

    public AppListener() {
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        String url = "jdbc:postgresql://localhost/mydb?user=chenzhongpu";
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection conn = DriverManager.getConnection(url);
            if (conn != null) {
                sce.getServletContext().setAttribute("conn", conn);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        /* This method is called when the servlet Context is undeployed or Application Server shuts down. */
        Connection connection = (Connection)sce.getServletContext().getContext("conn");
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
