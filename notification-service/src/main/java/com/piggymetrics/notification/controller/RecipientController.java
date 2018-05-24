package com.piggymetrics.notification.controller;


import com.piggymetrics.notification.domain.Recipient;
import com.piggymetrics.notification.service.RecipientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/recipients")
@Component
public class RecipientController {
    @Autowired
    private RecipientService recipientService;



    @GET
    @Path("/current")
    @Produces("application/json")
    public Object getCurrentNotificationsSettings() {
        Recipient byAccountName = recipientService.findByAccountName("gianni");
        System.out.println(byAccountName);
        return new Recipient();
    }

    @POST
    @Path("/current")
    @Consumes({"application/xml", "application/json"})
    public Object saveCurrentNotificationsSettings() {
        return null;
    }
}
