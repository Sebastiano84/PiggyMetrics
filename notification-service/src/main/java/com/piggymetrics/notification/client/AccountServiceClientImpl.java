package com.piggymetrics.notification.client;

import org.springframework.stereotype.Service;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

@Service
public class AccountServiceClientImpl implements AccountServiceClient {
    private static final String REST_URI
            = "/accounts/{accountName}";

    @Override
    public String getAccount(String accountName) {
        Client client = ClientBuilder.newClient();
        return client
                .target(REST_URI)
                .path(accountName)
                .request(MediaType.APPLICATION_JSON)
                .get(String.class);
    }

}
