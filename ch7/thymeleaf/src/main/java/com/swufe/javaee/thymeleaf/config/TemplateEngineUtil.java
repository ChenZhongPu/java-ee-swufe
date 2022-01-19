package com.swufe.javaee.thymeleaf.config;

import org.thymeleaf.TemplateEngine;

import javax.servlet.ServletContext;

public class TemplateEngineUtil {
    private static final String TEMPLATE_ENGINE = "com.swufe.javaee.thymeleaf.engine";

    public static void setTemplateEngine(ServletContext context, TemplateEngine engine) {
        context.setAttribute(TEMPLATE_ENGINE, engine);
    }

    public static TemplateEngine getTemplateEngine(ServletContext context) {
        return (TemplateEngine) context.getAttribute(TEMPLATE_ENGINE);
    }
}
