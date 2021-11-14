package com.xworkz.IronBox;
import com.xworkz.IronBox.IronBoxDTO.IronboxDTO;
import com.xworkz.IronBox.IronBoxDAO.IronboxDAO;
public class TesterIronBox {

	public static void main(String[] args) {
		IronboxDAO ibDao=new IronboxDAO();
		
		IronboxDTO bajaj=ibDao.create("Bajaj", "White", 2500, 1500); ibDao.save(bajaj);
		IronboxDTO philips=ibDao.create("Philips", "White", 1500, 1400); ibDao.save(philips);
		IronboxDTO bosch=ibDao.create("Bosch", "Black", 1000, 1200); ibDao.save(bosch);
		IronboxDTO omax=ibDao.create("Omax", "White", 2000, 1200); ibDao.save(omax);
		
		ibDao.displayInfo();
		ibDao.updateByWatt(1400, 1800);
		
		ibDao.displayByBrand("Bosch");
		ibDao.deleteByPrice(1500);
		
		System.out.println("-------------");
		ibDao.displayByBrand("Philips");
			
	}

}
