package com.simple.dto;

import java.util.Objects;

public class SimpleDTO {
	@Override
	public int hashCode() {
		return Objects.hash(name, password);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SimpleDTO other = (SimpleDTO) obj;
		return Objects.equals(name, other.name) && Objects.equals(password, other.password);
	}
	private String name;
	private String password;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public SimpleDTO(String name) {
		super();
		this.name = name;
	}
	public SimpleDTO() {
		// TODO Auto-generated constructor stub
	}
	
	
	public SimpleDTO(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	@Override
	public String toString() {
		return "SimpleDTO [name=" + name + ", password=" + password + "]";
	}
	
	
	

}
