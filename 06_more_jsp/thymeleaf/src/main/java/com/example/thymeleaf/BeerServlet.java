package com.example.thymeleaf;

import com.example.thymeleaf.model.Beer;
import com.example.thymeleaf.model.BeerExpert;
import org.thymeleaf.context.WebContext;
import tleaf.utils.TemplateUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "BeerServlet", value = "/beer")
public class BeerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Beer> beers = BeerExpert.getBeers();
        WebContext wx = new WebContext(request, response, request.getServletContext());
        wx.setVariable("beers", beers);
        TemplateUtils.process("beer", wx);
    }
}
