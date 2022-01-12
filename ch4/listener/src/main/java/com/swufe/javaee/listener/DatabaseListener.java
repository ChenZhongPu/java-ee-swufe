package com.swufe.javaee.listener;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebListener
public class DatabaseListener implements ServletContextListener {

    public DatabaseListener() {
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        /* This method is called when the servlet context is initialized(when the Web application is deployed). */
        String host = sce.getServletContext().getInitParameter("hostname");
        String user = sce.getServletContext().getInitParameter("user");
        String password = sce.getServletContext().getInitParameter("password");
        String database = sce.getServletContext().getInitParameter("database");

        DatabaseConn conn = new DatabaseConn(host, user, password, database);

        sce.getServletContext().setAttribute("database", conn);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        /* This method is called when the servlet Context is undeployed or Application Server shuts down. */
        System.out.println("conn.close()");
    }
}
