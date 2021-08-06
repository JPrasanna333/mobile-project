package com.mobileapp.service;

import com.mobileapp.exceptions.MobileNotFoundException;
import com.mobileapp.model.Mobile;

public class MobileServiceImpl implements MobileService {

	@Override
	public Mobile getById(int id) throws MobileNotFoundException {
		boolean b=false;
		Mobile nmobile = null;
		for (Mobile mobile : allMobiles()) {
			if ((mobile.getMobid()) == id) {
				b = true;
				nmobile = mobile;
			}

		}
		if (b==false) {
			throw new MobileNotFoundException("Invalid Id");
		}

		return nmobile;

	}

	@Override
	public Mobile[] getAll() {

		return allMobiles();
	}

	@Override
	public Mobile[] getByBrand(String brand) throws MobileNotFoundException {
		boolean b=false;
		int i=0;
		Mobile[] nmobile=new Mobile[5];
		for (Mobile mobile : allMobiles()) {
			if ((mobile.getBrand()).equalsIgnoreCase(brand)) {
				b = true;
				nmobile[i++] = mobile;
			}

		}
		if (b==false) {
			throw new MobileNotFoundException("Invalid brand");
		}

		return nmobile;
		
	}

	private Mobile[] allMobiles() {
		Mobile[] mobiles = new Mobile[5];
		mobiles[0] = new Mobile(1, "A1", "Vivo", 9000);
		mobiles[1] = new Mobile(2, "A123", "Samsung", 12000);
		mobiles[2] = new Mobile(3, "A1", "Vivo", 9000);
		mobiles[3] = new Mobile(4, "A1", "Vivo", 11000);
		mobiles[4] = new Mobile(1, "AX3", "Vivo", 9000);
		return mobiles;

	}

}
