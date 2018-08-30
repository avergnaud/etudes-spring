package com.poc;

public class Something {
	
	private ClientService clientService;
	
	public Something(ClientService clientService) {
		this.clientService = clientService;
	}
	
	public ClientService getClientService() {
		return this.clientService;
	}
}