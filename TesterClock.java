package com.xworkz.clock;
import com.xworkz.clock.DTO.ClockDTO;
import com.xworkz.clock.DAO.ClockDAO;

public class TesterClock {

	public static void main(String[] args) {
		
		ClockDAO clkDao=new ClockDAO();
		
		ClockDTO ajanta=clkDao.create("Ajanta", "Analog", "Brown", 500);
		clkDao.save(ajanta);
		ClockDTO Quartz=clkDao.create("Quartz", "Analog", "metal grey", 800);
		clkDao.save(Quartz);
		ClockDTO Floristic=clkDao.create("Floristic", "Digital", "Black", 1000);
		clkDao.save(Floristic);
		ClockDTO Efinito=clkDao.create("Efinito", "Analog", "bronze", 1200);
		clkDao.save(Efinito);
		
		clkDao.displayByBrand("Quartz");
		
		clkDao.updateByType("Digital", 1100);
		clkDao.deleteByPrice(1100);
		
		System.out.println("-------------");
		clkDao.displayInfo();
			

	}

}
