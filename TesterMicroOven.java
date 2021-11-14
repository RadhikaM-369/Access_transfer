package com.xworkz.MicroOven;
import com.xworkz.MicroOven.MicroOvenDTO.MicroOvenDTO;
import com.xworkz.MicroOven.MicroOvenDAO.MicroOvenDAO;

public class TesterMicroOven {

	public static void main(String[] args) {
		MicroOvenDAO moDAO=new MicroOvenDAO();
		MicroOvenDTO samsung=moDAO.create("Samsung", 8000, 24, "grey");
		moDAO.save(samsung);
		MicroOvenDTO LG=moDAO.create("LG", 10000, 21, "red");
		moDAO.save(LG);
		MicroOvenDTO IFB=moDAO.create("IFB", 15000, 30, "Blue");
		moDAO.save(IFB);
		MicroOvenDTO Panasonic=moDAO.create("Panasonic", 13000, 24, "Black");
		moDAO.save(Panasonic);
		
		moDAO.displayByBrandName("Panasonic");
		System.out.println("After update");
		
		moDAO.updatebybrand("Panasonic", 14000);
		moDAO.displayByBrandName("Panasonic");

		moDAO.deletebycapacity(30);
		moDAO.displayInfo();
	}

}
