package com.srnjak.junk.boundary;

import com.srnjak.junk.boundary.dto.Pet;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

//@Path("myresource")
public class MyResource {

//    @POST
    public Response post(Pet pet) {
        return Response.ok(pet).build();
    }
}
