package com.xworkz.Inverter;

import com.xworkz.Inverter.InverterDTO.InDTO;
import com.xworkz.Inverter.InverterDAO.InDAO;

public class TesterInverter {

	public static void main(String[] args) {
		
		InDAO idao=new InDAO();
		
		InDTO luminous=idao.create("luminous", "White", 10500, 240); idao.save(luminous);
		InDTO Vgaurd=idao.create("Vgaurd", "White", 1000,240); idao.save(Vgaurd);
		InDTO microtek=idao.create("microtek", "Black", 11000, 300); idao.save(microtek);
		InDTO exide=idao.create("exide", "White", 12000, 440); idao.save(exide);
		
		idao.displayInfo();
		idao.updateByWatt(300, 12500);
		
		idao.displayByBrand("microtek");
		idao.deleteByPrice(12000);
		
		System.out.println("-------------");
		idao.displayByBrand("Vgaurd");
	}

}
