package com.example.request;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Upload2Servlet", value = "/upload2")
@MultipartConfig
public class Upload2Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Part file = request.getPart("file");
        String name = file.getSubmittedFileName();
        // Windows path can be: "C:\\Users\\zhongpu\\Desktop\\"
        file.write("/Users/zhongpu/Desktop/" + name);
    }
}
