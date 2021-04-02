package com.swufe.javaee.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(urlPatterns = "/hobbyFind")
public class HobbyServlet extends HttpServlet {
    private Map<String, String> userHobby;
    @Override
    public void init() {
       userHobby = new HashMap<>();
       userHobby.put("Bob", "skiing");
       userHobby.put("Jim", "skiing");
       userHobby.put("James", "knitting");
       userHobby.put("Tom", "knitting");
       userHobby.put("Fei", "scuba");
       userHobby.put("Jone", "scuba");
       userHobby.put("Fred", "dating");
       userHobby.put("Pradeep", "dating");
       userHobby.put("Philippe", "dating");
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String hobby = request.getParameter("hobby");
       List<String> names = new ArrayList<>();
       userHobby.forEach((k, v) -> {
           if (v.equals(hobby)) {
               names.add(k);
           }
       });
       request.setAttribute("names", names);
       request.setAttribute("hobby", hobby);
       request.getRequestDispatcher("hobbyResult.jsp").forward(request, response);
    }

}
