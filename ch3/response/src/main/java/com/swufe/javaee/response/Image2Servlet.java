package com.swufe.javaee.response;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.InputStream;

@WebServlet(name = "Image2Servlet", value = "/image2")
public class Image2Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("image/png");
        ServletOutputStream os = response.getOutputStream();
        InputStream is = getClass().getClassLoader().getResourceAsStream("cat2.png");
        assert is != null;
        byte[] data = is.readAllBytes();
        os.write(data);
    }
}
