package com.swufe.javaee.request_response;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "RedirectServlet", value = "/redirect")
public class RedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Random random = new Random();
        int i = random.nextInt(10);
        if (i > 7) {
            response.sendRedirect("https://www.baidu.com");
        } else if (i > 4){
            response.sendRedirect("image");
        } else {
            response.sendRedirect("selectbeer.html");
        }
    }
}
