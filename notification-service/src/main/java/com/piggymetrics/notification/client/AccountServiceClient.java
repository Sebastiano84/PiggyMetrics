package com.piggymetrics.notification.client;

public interface AccountServiceClient {

	//@RequestMapping(method = RequestMethod.GET, value = "/accounts/{accountName}", consumes = MediaType.APPLICATION_JSON_VALUE)
	String getAccount(String accountName);

}
