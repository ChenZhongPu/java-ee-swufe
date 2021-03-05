package com.swufe.javaee.attributes_listeners;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet", initParams = {
        @WebInitParam(name="email", value="blooper@wickedlysmart.com")
})
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<p>email by getInitParameter() -> " + getInitParameter("email") + "</p>");
        out.println("<p>email by getServletConfig().getInitParameter() -> " + getServletConfig().getInitParameter("email") + "</p>");
        out.println("<p>adminEmail by getServletContext().getInitParameter() -> " + getServletContext().getInitParameter("adminEmail") + "</p>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}