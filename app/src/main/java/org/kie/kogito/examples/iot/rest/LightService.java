package org.kie.kogito.examples.iot.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/light")
@RegisterRestClient
public interface LightService {

    @GET
    @Path("/dimmer")
    @Produces("application/json")
    DimmerResponse getDimmer();


    @POST
    @Path("/dimmer")
    @Produces("application/json")
    @Consumes("application/json")
    DimmerResponse dim(DimmerRequest payload);
}