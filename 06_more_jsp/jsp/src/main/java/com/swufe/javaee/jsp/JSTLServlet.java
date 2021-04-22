package com.swufe.javaee.jsp;

import com.swufe.javaee.jsp.model.Cat;
import com.swufe.javaee.jsp.model.Dog;
import com.swufe.javaee.jsp.model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "JSTLServlet", value = "/jstl")
public class JSTLServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> users = new ArrayList<>();
        users.add(new User(new Cat("Cat A", 3), 10));
        users.add(new User(new Cat("Cat B", 8), 19));
        users.add(new User(new Cat("Cat C", 5), 20));
        users.add(new User(new Cat("Cat D", 5), 15));

        request.setAttribute("users", users);

        request.setAttribute("user", "Admin");

        request.getRequestDispatcher("jstl-result.jsp").forward(request, response);


    }
}
