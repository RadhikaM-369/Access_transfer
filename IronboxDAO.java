package com.xworkz.IronBox.IronBoxDAO;
import com.xworkz.IronBox.IronBoxDTO.IronboxDTO;

public class IronboxDAO {
	
	IronboxDTO ibDTO[] =new IronboxDTO[4];
	int index=0;
	public IronboxDAO() {
		System.out.println("Inside iron box DAO constructor");
	}
	public void save(IronboxDTO ibDto) {
		ibDTO[index]=ibDto;
		index++;
	}
	public IronboxDTO create(String brand, String color, int price, int watt) {
		IronboxDTO obj=new IronboxDTO(brand, color, price, watt);
		return obj;
	}
	public void displayInfo() {
		for (int i = 0; i < ibDTO.length; i++) {
			System.out.println(ibDTO[i].getBrand());
			System.out.println(ibDTO[i].getColor());
			System.out.println(ibDTO[i].getPrice());
			System.out.println(ibDTO[i].getWatt());
		}	}
	
	public void displayByBrand(String brandName) {
		for (int i = 0; i < ibDTO.length; i++) {
			if(ibDTO[i].getBrand().equals(brandName)) {
			System.out.println(ibDTO[i].getBrand());
			System.out.println(ibDTO[i].getColor());
			System.out.println(ibDTO[i].getPrice());
			System.out.println(ibDTO[i].getWatt());
		}	}	}
	
	public void updateByWatt(int watt,int newprice) {
		for (int i = 0; i < ibDTO.length; i++) {
			if(ibDTO[i].getWatt()==watt) {
				ibDTO[i].setPrice(newprice);
			}	}	}
	
	public void deleteByPrice(int price) {
		for (int i = 0; i < ibDTO.length; i++) {
			if(ibDTO[i].getPrice()==price) {
				ibDTO[i]=null;
			}			}	}

}
