package com.customer.dto;

public class CustomerDTO {
	private String customerId;
	private String name,gender;
	private int age;
	private long homeNo,mobileNo;
	 AddressDTO addr=new AddressDTO();
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public AddressDTO getAddr() {
		return addr;
	}
	public void setAddr(AddressDTO addr) {
		this.addr = addr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getHomeNo() {
		return homeNo;
	}
	public void setHomeNo(long homeNo) {
		this.homeNo = homeNo;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	}
