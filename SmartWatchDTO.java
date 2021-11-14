package com.xworkz.smartWatch.SmartWatchDTO;

public class SmartWatchDTO {
private String brand;
private String color;
private int price;
private int serialNo;
public SmartWatchDTO(String brand, String color, int price, int serialNo) {
	super();
	this.brand = brand;
	this.color = color;
	this.price = price;
	this.serialNo = serialNo;
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
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getSerialNo() {
	return serialNo;
}
public void setSerialNo(int serialNo) {
	this.serialNo = serialNo;
}}
