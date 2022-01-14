package com.swufe.javaee.el;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "OperatorServlet", value = "/operator")
public class OperatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String num = "42";
        request.setAttribute("num", num);
        int i = 43;
        request.setAttribute("integer", i);
        request.getRequestDispatcher("/WEB-INF/operator.jsp").forward(request, response);
    }
}
