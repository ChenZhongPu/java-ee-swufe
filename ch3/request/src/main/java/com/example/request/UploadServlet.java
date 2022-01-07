package com.example.request;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

@WebServlet(name = "UploadServlet", value = "/upload")
@MultipartConfig
public class UploadServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        Part part = request.getPart("file");
        String fileName = part.getSubmittedFileName();
        InputStream is = part.getInputStream();
        // Windows path can be: "C:\\Users\\zhongpu\\Desktop\\"
        Path path = Path.of("/Users/zhongpu/Desktop/" + fileName);
        Files.copy(is, path);
        PrintWriter out = response.getWriter();
        out.println("upload ok");
    }
}
