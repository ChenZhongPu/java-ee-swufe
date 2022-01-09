package com.swufe.javaee.response;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

@WebServlet(name = "StaticResourceServlet", value = "/static/*")
public class StaticResourceServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fileName = URLDecoder.decode(request.getPathInfo().substring(1), StandardCharsets.UTF_8);
        String mime = getServletContext().getMimeType(fileName);
        // For Windows users: C:\\Users\\zhongpu\\Desktop\\foo
        Path source = Path.of("/Users/zhongpu/Desktop/foo", fileName);
        if (source.toFile().exists()) {
            response.setContentType(mime);
            ServletOutputStream os = response.getOutputStream();
            Files.copy(source, os);
        } else {
            response.sendError(404);
        }

    }
}
