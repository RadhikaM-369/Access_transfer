package com.xworkz.smartWatch.SmartWatchDAO;
import com.xworkz.smartWatch.SmartWatchDTO.SmartWatchDTO;

public class SmartWatchDAO {
	
	SmartWatchDTO smartwatch[]=new SmartWatchDTO[5];
	int index=0;
	
	public SmartWatchDAO() {
		System.out.println("Smart watch DAO constructor");
	}
	public SmartWatchDTO createSmartWatchDTO(String brand, String color, int price, int serialNo) {
		SmartWatchDTO swdto=new SmartWatchDTO(brand, color, price, serialNo);
		return swdto;
	}
	public void save(SmartWatchDTO dto) {
		System.out.println("Inside the save method");
		smartwatch[index]=dto;
		index++;
	}
	public void displayInfo() {
		for(int i=0;i<smartwatch.length;i++) {
			System.out.println("display smart watch Info");
			System.out.println(smartwatch[i].getBrand());
			System.out.println(smartwatch[i].getColor());
			System.out.println(smartwatch[i].getSerialNo());
			System.out.println(smartwatch[i].getPrice());
		}
	}
	public void displayByBrandName(String brandName) {
		for (int i = 0; i < smartwatch.length; i++) {
			if(smartwatch[i].getBrand().equals(brandName)) {
				System.out.println("display smart watch Info by brand name");
				System.out.println(smartwatch[i].getBrand());
				System.out.println(smartwatch[i].getColor());
				System.out.println(smartwatch[i].getSerialNo());
				System.out.println(smartwatch[i].getPrice());
			}
		}
	}
	
	public void updateByBrand(String brand, int newPrice) {
		for (int i = 0; i < smartwatch.length; i++) {
			if(smartwatch[i].getBrand().equals(brand)) {
				smartwatch[i].setPrice(newPrice);
			}
		}
	}
	
	public void updateBrandByBrandName(String brand, String newBrandName) {
		for (int i = 0; i < smartwatch.length; i++) {
			if(smartwatch[i].getBrand().equals(brand)) {
				smartwatch[i].setBrand(newBrandName);
			}
		}
	}
	public void deleteByprice(int newprice) {
		for (int i = 0; i < smartwatch.length; i++) {
			if(smartwatch[i].getPrice()==newprice) {
				smartwatch[i]=null;
			}
		}
	}

}
