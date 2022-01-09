package com.swufe.javaee.response;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.InputStream;

@WebServlet(name = "ImageServlet", value = "/image")
public class ImageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("image/png");
        ServletOutputStream os = response.getOutputStream();
        InputStream is = getServletContext().getResourceAsStream("cat.png");
        byte[] data = is.readAllBytes();
        os.write(data);
    }
}
