package com.upaio;

import jakarta.ws.rs.Path;
import org.jboss.logging.Logger;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
@Path("api")
public class GreetingResource {

    private static final Logger LOG = Logger.getLogger(GreetingResource.class);

    /**
     * @return
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String hello() {
        LOG.debug("Hi from debug");
        LOG.info("Hi from info");
        return "Hello from RESTEasy Reactive";
    }
}