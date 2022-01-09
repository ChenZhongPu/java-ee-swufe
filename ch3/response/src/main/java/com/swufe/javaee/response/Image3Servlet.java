package com.swufe.javaee.response;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;

@WebServlet(name = "Image3Servlet", value = "/Image3Servlet")
public class Image3Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("image/png");
        ServletOutputStream os = response.getOutputStream();
        try {
            Path source = Path.of(getServletContext().getResource("cat.png").toURI());
            Files.copy(source, os);
            os.close();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
