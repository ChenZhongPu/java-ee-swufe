package com.example.restdemo;

import com.example.restdemo.model.Person;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/person")
public class PersonResource {
    @POST
    @Produces("text/plain")
    @Path("/create")
    public String signup(@FormParam("name") String name,
                         @FormParam("pwd") String password) {
        Person person = new Person(name, password);
        return "Hello, World! " + person;
    }
}