package com.piggymetrics.notification;

/*
 *------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2018
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *------------------------------------------------------------------------------
 */

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Path("/hello")
public class HelloWorldEndpoint {

    public HelloWorldEndpoint() {
        System.out.println("HelloWorldEndpoint.HelloWorldEndpoint");
    }

    @GET
    @Produces("text/plain")
    @Path("/hello")
    public Response doGet() {
        return Response.ok("Hello from WildFly Swarm!").build();
    }


    @GET
    @Produces("text/plain")
    @Path("/login")
    public Response doGet(@Context SecurityContext context) {
        System.out.println(context);
        return Response.ok("Hello from WildFly Swarm!").build();
    }

}
