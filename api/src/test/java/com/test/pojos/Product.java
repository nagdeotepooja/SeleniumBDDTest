package com.test.pojos;

import org.apache.juneau.annotation.Beanc;

public class Product {

	private String name;
	private int price;
	private String color;
	
	@Beanc(properties="name,price,color")
	public Product(String name, int price, String color){
		this.name = name;
		this.price = price;
		this.color = color;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		 this.name = name;
	}
	
	public int getprice() {
		return price;
	}
	public void setPrice(int price) {
		 this.price = price;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		 this.color = color;
	}
	
	public String toString() {
		return "Product [Name: "+name+",Price: "+price+",Color: "+color+"]";
	}
	

}
