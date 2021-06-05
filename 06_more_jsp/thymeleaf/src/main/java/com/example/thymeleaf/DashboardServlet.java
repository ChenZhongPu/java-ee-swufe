package com.example.thymeleaf;

import org.thymeleaf.context.WebContext;
import tleaf.utils.Leaf;
import tleaf.utils.TemplateUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "DashboardServlet", value = "/dashboard")
@Leaf("dashboard")
public class DashboardServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        WebContext wx = new WebContext(request, response, request.getServletContext());
        TemplateUtils.process(wx);
    }
}
