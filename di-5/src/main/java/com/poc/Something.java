package com.poc;

public class Something {
	
	private Client client;
	
	public Something(Client client) {
		this.client = client;
	}
	
	public Client getClient() {
		return this.client;
	}
}