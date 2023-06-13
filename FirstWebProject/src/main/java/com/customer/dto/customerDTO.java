package com.customer.dto;

import java.io.Serializable;

public class customerDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private static final long SerialVersionUID=1L;
	private String name;
	private String address;
	private long contact;
	private String email;
	
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
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
