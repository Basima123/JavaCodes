package com.my.dto;

import java.util.Objects;

public class ProductDTO {
	private String id;
	private String name;
	private String size;
	private String category;
	private String price;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
		
		
	}
	
	public ProductDTO(String name, String size, String category, String price, String id) {
		super();
		this.name = name;
		this.size = size;
		this.category = category;
		this.price = price;
		this.id = id;
	}
	@Override
	public int hashCode() {
		return Objects.hash(category, id, name, price, size);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductDTO other = (ProductDTO) obj;
		return Objects.equals(category, other.category) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(price, other.price)
				&& Objects.equals(size, other.size);
		
	}
	@Override
	public String toString() {
		return "product [id=" + id + ", name=" + name + ", size=" + size + ", category=" + category + ", price=" + price
				+ "]";
	}
	
	
	}

