package com.poc;

public class Something {
	
	private boolean managed;
	
	public Something(boolean b, String autre) {
		System.out.println("Something created " + b + " " + autre);
		this.managed = b;
	}
	
	public boolean isManaged() {
		return this.managed;
	}
	
	public void setManaged(boolean b) {
		this.managed = b;
	}
}