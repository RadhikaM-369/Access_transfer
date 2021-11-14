package com.xworkz.Inverter.InverterDAO;

import com.xworkz.Inverter.InverterDTO.InDTO;

public class InDAO {
	
	InDTO iDTO[] =new InDTO[4];
	int index=0;
	public InDAO() {
		System.out.println("Inside Inverter DAO constructor");
	}
	public void save(InDTO obj) {
		iDTO[index]=obj;
		index++;
	}
	public InDTO create(String brand, String color, int price, int watt) {
		InDTO inverterObj=new InDTO(brand, color, price, watt);
		return inverterObj;
	}
	public void displayInfo() {
		for (int i = 0; i < iDTO.length; i++) {
			System.out.println(iDTO[i].getBrand());
			System.out.println(iDTO[i].getColor());
			System.out.println(iDTO[i].getPrice());
			System.out.println(iDTO[i].getWatt());
		}	}
	
	public void displayByBrand(String brandName) {
		for (int i = 0; i < iDTO.length; i++) {
			if(iDTO[i].getBrand().equals(brandName)) {
			System.out.println(iDTO[i].getBrand());
			System.out.println(iDTO[i].getColor());
			System.out.println(iDTO[i].getPrice());
			System.out.println(iDTO[i].getWatt());
		}	}	}
	
	public void updateByWatt(int watt,int newprice) {
		for (int i = 0; i < iDTO.length; i++) {
			if(iDTO[i].getWatt()==watt) {
				iDTO[i].setPrice(newprice);
			}	}	}
	
	public void deleteByPrice(int price) {
		for (int i = 0; i < iDTO.length; i++) {
			if(iDTO[i].getPrice()==price) {
				iDTO[i]=null;
			}			}	}

}
