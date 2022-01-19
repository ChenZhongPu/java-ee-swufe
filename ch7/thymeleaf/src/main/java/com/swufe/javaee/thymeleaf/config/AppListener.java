package com.swufe.javaee.thymeleaf.config;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ITemplateResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

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
      TemplateEngine engine = templateEngine(sce.getServletContext());
      TemplateEngineUtil.setTemplateEngine(sce.getServletContext(), engine);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        /* This method is called when the servlet Context is undeployed or Application Server shuts down. */
    }

    private TemplateEngine templateEngine(ServletContext context) {
        TemplateEngine engine = new TemplateEngine();
        engine.setTemplateResolver(templateResolver(context));
        return engine;
    }

    private ITemplateResolver templateResolver(ServletContext context) {
        ServletContextTemplateResolver resolver = new ServletContextTemplateResolver(context);
        resolver.setPrefix("/WEB-INF/templates/");
        resolver.setTemplateMode(TemplateMode.HTML);
        return resolver;
    }
}
