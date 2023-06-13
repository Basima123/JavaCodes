package com.reg.dto;

import java.util.Date;

public class RegDTO {
	private String name;
	private int age;
	private Date date;
	private String lang;
	private String gender;
	private String uname;
	private String password;
	private String email;
	private long contact;
	private String address;
	String type;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public RegDTO() {
	}
	public RegDTO(String uname, String password) {
		super();
		this.uname = uname;
		this.password = password;
	}
	public RegDTO(String name, int age, Date date, String lang, String gender, String uname, String password,
			String email, long contact, String address, String type) {
		super();
		this.name = name;
		this.age = age;
		this.date = date;
		this.lang = lang;
		this.gender = gender;
		this.uname = uname;
		this.password = password;
		this.email = email;
		this.contact = contact;
		this.address = address;
		this.type = type;
		
	}
	@Override
	public String toString() {
		return "RegDTO [name=" + name + ", age=" + age + ", date=" + date + ", lang=" + lang + ", gender=" + gender
				+ ", uname=" + uname + ", password=" + password + ", email=" + email + ", contact=" + contact
				+ ", address=" + address + ", type=" + type + "]";
	}
	
	
	
}
