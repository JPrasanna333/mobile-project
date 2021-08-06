package com.mobileapp.service;

import com.mobileapp.exceptions.MobileNotFoundException;
import com.mobileapp.model.*;

public interface MobileService {
	Mobile getById(int id) throws MobileNotFoundException;

	Mobile[] getAll();

	Mobile[] getByBrand(String brand) throws MobileNotFoundException;

}
