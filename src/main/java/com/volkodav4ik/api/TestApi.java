package com.volkodav4ik.api;

import com.google.gson.Gson;
import com.volkodav4ik.model.User;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public class TestApi {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response doGet() {
        User user = new User("Alex", 22);
        Gson gson = new Gson();
        String json = gson.toJson(user);
        return Response.status(Response.Status.OK).entity(json).build();
    }

}
