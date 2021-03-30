package com.swufe.javaee.request_response;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "DispatchServlet", value = "/DispatchServlet")
public class DispatchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Please refer to BeerV1 project to see how to dispatch request to JSP
        // both "ClientInfoServlet" and "/ClientInfoServlet" can work.
        RequestDispatcher view = request.getRequestDispatcher("/ClientInfoServlet");
        view.forward(request, response);
    }
}
