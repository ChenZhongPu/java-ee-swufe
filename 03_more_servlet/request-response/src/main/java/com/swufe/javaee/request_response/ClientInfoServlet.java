package com.swufe.javaee.request_response;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.swufe.javaee.request_response.utils.AgentChecker;
import com.swufe.javaee.request_response.utils.Client;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ClientInfoServlet", value = "/ClientInfoServlet")
public class ClientInfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String agent = request.getHeader("User-Agent");
        Client client = new Client(AgentChecker.getOS(agent), AgentChecker.getBrowser(agent));
        ObjectMapper objectMapper = new ObjectMapper();
        String clintJson = objectMapper.writeValueAsString(client);
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        out.println(clintJson);
    }
}
