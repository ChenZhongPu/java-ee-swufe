package com.example.request;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ClientServlet", value = "/client")
public class ClientServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String agent = request.getHeader("User-Agent");
        String client = ClientUtil.getClient(agent);
        request.setAttribute("client", client);
        request.getRequestDispatcher("client.jsp").forward(request, response);
    }
}
