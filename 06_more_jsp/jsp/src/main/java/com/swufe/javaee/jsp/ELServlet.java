package com.swufe.javaee.jsp;

import com.swufe.javaee.jsp.model.Dog;
import com.swufe.javaee.jsp.model.Person;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "ELServlet", value = "/el")
public class ELServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Dog dog = new Dog("Bob");
        request.setAttribute("dog", dog);
        Person person = new Person("Jay", dog);
        request.setAttribute("person", person);
        Map<String, String> map = new HashMap<>();
        map.put("shanghai", "CN"); map.put("london", "UK");
        request.setAttribute("city", map);
        request.setAttribute("balance", 100);
        request.getRequestDispatcher("el-result.jsp").forward(request, response);
    }
}
