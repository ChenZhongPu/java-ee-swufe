package com.example.restdemo;

import com.example.restdemo.model.Beer;
import com.example.restdemo.model.BeerExpert;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/")
public class BeerResource {
    @GET
    @Path("/beers")
    public Response beers() {
        List<Beer> beers = BeerExpert.getBeers();
        return Response.status(Response.Status.OK)
                .entity(beers)
                .build();
    }

    @GET
    @Path("/v2/beers")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Beer> getBeers() {
        return BeerExpert.getBeers();
    }

    @GET
    @Path("/beers/color/{color}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Beer> getBeersByColor(@PathParam("color") String color) {
        return BeerExpert.getBeersByColor(color);
    }

}