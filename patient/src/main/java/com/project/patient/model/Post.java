package com.project.patient.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Patient")
public class Post {
	
	private String name;
	private int contact;
	private String address;
	
	public Post() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Post [name=" + name + ", contact=" + contact + ", address=" + address + "]";
	}
	
	

	
	
}
