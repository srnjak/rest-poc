package com.srnjak.junk.boundary;

import com.srnjak.junk.service.MyBean;
import com.srnjak.junk.service.MyEjb;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("myresource")
public class MyResource {

    @Inject
    private MyBean myBean;

    @Inject
    private MyEjb myEjb;

    @GET
    @Path("/cdi")
    @Produces(MediaType.TEXT_PLAIN)
    public String getCdi(@QueryParam("input") String input) {
        try {
            return myBean.doSomething(input);
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @GET
    @Path("/ejb")
    @Produces(MediaType.TEXT_PLAIN)
    public String getEjb(@QueryParam("input") String input) {

        try {
            return myEjb.doSomething(input);
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
