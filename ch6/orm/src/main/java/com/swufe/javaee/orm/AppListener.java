package com.swufe.javaee.orm;

import com.swufe.javaee.orm.util.DBUtil;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebListener
public class AppListener implements ServletContextListener {

    public AppListener() {
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        /* This method is called when the servlet context is initialized(when the Web application is deployed). */
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        /* This method is called when the servlet Context is undeployed or Application Server shuts down. */
        if (DBUtil.getSessionFactory() != null) {
            DBUtil.getSessionFactory().close();
        }
    }
}
