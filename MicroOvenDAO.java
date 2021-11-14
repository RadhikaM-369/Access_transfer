package com.xworkz.MicroOven.MicroOvenDAO;
import com.xworkz.MicroOven.MicroOvenDTO.MicroOvenDTO;

public class MicroOvenDAO {
MicroOvenDTO moDTO[]=new MicroOvenDTO[4];
int index=0;
public MicroOvenDAO() {
	super();
	System.out.println("inside micro oven constructor");
}
public void save(MicroOvenDTO obj) {
	System.out.println("Inside save method");
	moDTO[index]=obj;
	index++;
}
public void displayInfo() {
	for (int i = 0; i < moDTO.length; i++) {
		System.out.println(moDTO[i].getBrand());
		System.out.println(moDTO[i].getCapacity());
		System.out.println(moDTO[i].getColor());
		System.out.println(moDTO[i].getPrice());
	}
}
public void displayByBrandName(String brandName) {
	for (int i = 0; i < moDTO.length; i++) {
		if(moDTO[i].getBrand().equals(brandName)) {
			System.out.println(moDTO[i].getBrand());
			System.out.println(moDTO[i].getCapacity());
			System.out.println(moDTO[i].getColor());
			System.out.println(moDTO[i].getPrice());
		}
	}
}
public MicroOvenDTO create(String brand, int price, int capacity, String color) {
	MicroOvenDTO moDTO=new MicroOvenDTO(brand, price, capacity, color);
	return moDTO;
}
public void updatebybrand(String brand, int newprice) {
	for (int i = 0; i < moDTO.length; i++) {
		if(moDTO[i].getBrand().equals(brand)) {
			moDTO[i].setPrice(newprice);
		}
}}
public void deletebycapacity(int capacity) {
	for (int i = 0; i < moDTO.length; i++) {
		if (moDTO[i].getCapacity()==capacity) {
			moDTO[i]=null;
		}
	}
}


}
