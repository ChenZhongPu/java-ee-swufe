package com.swufe.javaee.response;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Forward3Servlet", value = "/forward3")
public class Forward3Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       request.setAttribute("result", "some result");
       request.getRequestDispatcher("/WEB-INF/result.jsp").forward(request, response);
    }
}
