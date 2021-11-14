package com.xworkz.MicroOven.MicroOvenDTO;

public class MicroOvenDTO {
	private String brand;
	private int price;
	private int capacity;
	private String color;
	public MicroOvenDTO(String brand, int price, int capacity, String color) {
		super();
		this.brand = brand;
		this.price = price;
		this.capacity = capacity;
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}}
