package com.swufe.javaee.init;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Init2Servlet", value = "/init2", initParams = {
        @WebInitParam(name = "path", value = "C:\\Users\\zhongpu Desktop\\foo")
})
public class Init2Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String path = getInitParameter("path");
        response.getWriter().println(path);
    }
}
