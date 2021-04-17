package com.swufe.javaee.session;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "URLRewriteServlet", value = "/url-rewrite")
public class URLRewriteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        session.setAttribute("a", 1);
        out.println("<html><body>");
        out.println("<a href=\"" + response.encodeURL("hello-servlet") + "\">click me</a>");
        out.println("</body></html>");
    }
}
