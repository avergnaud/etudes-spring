package com.poc;

public class Client {
	int id;
	public Client(int i) {
		System.out.println("created client " + i);
		this.id = i;
	}
	public int getId() {
		return this.id;
	}
}