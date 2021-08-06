package com.mobileapp.client;

import java.util.Scanner;

import com.mobileapp.exceptions.MobileNotFoundException;
import com.mobileapp.model.Mobile;
import com.mobileapp.service.MobileService;
import com.mobileapp.service.MobileServiceImpl;

public class Main {

	public static void main(String[] args) {
		MobileService ms = new MobileServiceImpl();
		for (Mobile m : ms.getAll()) {
			System.out.println(m);
		}
		Scanner kb = new Scanner(System.in);
		System.out.println("\nPlease enter the ID of the mobile you want to find");
		int id = kb.nextInt();
		try {
			System.out.println(ms.getById(id));
			System.out.println();
			System.out.println("Please enter the BRAND of the mobile you want to find");
			String brand = kb.next();
			for (Mobile m1 : ms.getByBrand(brand)) {
				if (m1 != null) {
					System.out.println(m1);
				}
			}
			System.out.println();
		} catch (MobileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		kb.close();

	}

}
