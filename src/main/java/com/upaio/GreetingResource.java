package com.upaio;

import com.upaio.models.ServiceRequestGreetings;
import com.upaio.models.ServiceResponseGreetings;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import org.jboss.logging.Logger;

import jakarta.ws.rs.core.MediaType;
@Path("api")
public class GreetingResource {

    private static final Logger LOG = Logger.getLogger(GreetingResource.class);

    /**
     * @return
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getHello(@QueryParam("greeting") String greeting) {
        LOG.debug("Started method getHello");
        LOG.info("Started method getHello");
        ServiceResponseGreetings serviceResponseGreetings = new ServiceResponseGreetings();
        serviceResponseGreetings.setGreeting(greeting);

        return Response.ok(serviceResponseGreetings).build();
    }

    /**
     * @return
     */
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response postHello(ServiceRequestGreetings serviceRequestPostGreetings){
        LOG.debug("Started method postHello");
        LOG.info("Started method postHello");
        ServiceResponseGreetings serviceResponseGreetings = new ServiceResponseGreetings();
        serviceResponseGreetings.setGreeting(serviceRequestPostGreetings.getGreeting());
        return Response.ok(serviceResponseGreetings).build();
    }
}