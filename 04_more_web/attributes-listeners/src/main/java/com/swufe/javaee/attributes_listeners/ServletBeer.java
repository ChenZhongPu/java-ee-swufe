package com.swufe.javaee.attributes_listeners;

import com.swufe.javaee.attributes_listeners.model.BeerExpert;
import com.swufe.javaee.attributes_listeners.model.Dog;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;
import java.util.Random;

@WebServlet(name = "ServletBeer", value = "/selectBeer")
public class ServletBeer extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String c = request.getParameter("color");
        BeerExpert expert = new BeerExpert();
        List<String> result = expert.getBrands(c);
        request.setAttribute("styles", result);
        request.setAttribute("school", "SWUFE");
        Dog dog = (Dog) getServletContext().getAttribute("dog");
        request.getSession().setAttribute("dog", dog);
        RequestDispatcher view;
        Random random = new Random();
        if (random.nextInt(10) > 5) {
            System.out.println("--- dispatch from request ---");
            // both "/result.jsp" and "result.jsp" are fine in our case.
            view =  request.getRequestDispatcher("/result.jsp");
        } else {
            System.out.println("--- dispatch from context ---");
            // you must use the forward slash ("/")
            view = getServletContext().getRequestDispatcher("/result.jsp");
        }
        view.forward(request, response);
    }
}
