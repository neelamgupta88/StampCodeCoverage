package com.pega.sample.users;

public class Customer {

	private String name;

	private String id;

	private String address;
	
	public Customer(String name, String country) {
		this.name = name;
		this.address = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
