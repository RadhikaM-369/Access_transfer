package com.xworkz.clock.DAO;

import com.xworkz.clock.DTO.ClockDTO;

public class ClockDAO {
	ClockDTO clkDto[]=new ClockDTO[4];
	int index=0;
	public ClockDAO() {
		System.out.println("Inside clock DAO");
	}
	public void save(ClockDTO clk) {
		clkDto[index]=clk;
		index++;
	}
	public ClockDTO create(String brand, String type, String color, int price) {
		ClockDTO obj=new ClockDTO(brand, type, color, price);
		return obj;
	}
	public void displayInfo() {
		for (int i = 0; i < clkDto.length; i++) {
			System.out.println(clkDto[i].getBrand());
			System.out.println(clkDto[i].getColor());
			System.out.println(clkDto[i].getPrice());
			System.out.println(clkDto[i].getType());
		}	}
	
	public void displayByBrand(String brandName) {
		for (int i = 0; i < clkDto.length; i++) {
			if(clkDto[i].getBrand().equals(brandName)) {
			System.out.println(clkDto[i].getBrand());
			System.out.println(clkDto[i].getColor());
			System.out.println(clkDto[i].getPrice());
			System.out.println(clkDto[i].getType());
		}	}	}
	
	public void updateByType(String type,int newprice) {
		for (int i = 0; i < clkDto.length; i++) {
			if(clkDto[i].getType().equals(type)) {
				clkDto[i].setPrice(newprice);
			}	}	}
	
	public void deleteByPrice(int price) {
		for (int i = 0; i < clkDto.length; i++) {
			if(clkDto[i].getPrice()==price) {
				clkDto [i]=null;
			}			}	}
	
	

}
