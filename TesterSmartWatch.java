package com.xworkz.smartWatch;
import com.xworkz.smartWatch.SmartWatchDTO.SmartWatchDTO;
import com.xworkz.smartWatch.SmartWatchDAO.SmartWatchDAO;

public class TesterSmartWatch {

	public static void main(String[] args) {
		SmartWatchDAO smartwatchDao=new SmartWatchDAO();
		
		SmartWatchDTO fossil=smartwatchDao.createSmartWatchDTO("fossil", "Blue", 8000, 1122);
		smartwatchDao.save(fossil);
		SmartWatchDTO Samsung=smartwatchDao.createSmartWatchDTO("Samsung", "Red", 10000, 1133);
		smartwatchDao.save(Samsung);
		SmartWatchDTO MI=smartwatchDao.createSmartWatchDTO("MI", "Blue", 9000, 1144);
		smartwatchDao.save(MI);
		SmartWatchDTO noise=smartwatchDao.createSmartWatchDTO("noise", "White", 8000, 1155);
		smartwatchDao.save(noise);
		SmartWatchDTO fitbul=smartwatchDao.createSmartWatchDTO("fitbul", "White", 12000, 1166);
		smartwatchDao.save(fitbul);

		
		System.out.println("Brand name before update");
		smartwatchDao.displayByBrandName("MI");
		
		smartwatchDao.updateByBrand("MI", 10000);
		System.out.println("Brand name after price update");
		smartwatchDao.displayByBrandName("MI");
		
		System.out.println("after upadate Brand name by brand name");
		smartwatchDao.updateBrandByBrandName("MI", "MI Pro");
		smartwatchDao.displayByBrandName("MI pro");
		
		smartwatchDao.deleteByprice(8000);
		smartwatchDao.displayByBrandName("fitbul");	
		
	}

}
