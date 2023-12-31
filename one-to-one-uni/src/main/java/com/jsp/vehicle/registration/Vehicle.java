package com.jsp.vehicle.registration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Vehicle {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private String brand;
	private String color;
	private float price;
	
	@OneToOne
	private Registration registration;
	
	public Registration getRegistration() {
		return registration;
	}
	public void setRegistration(Registration registration) {
		this.registration = registration;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	
}
