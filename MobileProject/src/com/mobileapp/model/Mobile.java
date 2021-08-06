package com.mobileapp.model;

public class Mobile {

	int mobid;
	String brand;
	String model;
	double price;

	public Mobile(int mobid, String brand, String model, double price) {
		super();
		this.mobid = mobid;
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return price;
	}

	public int getMobid() {
		return mobid;
	}

	@Override
	public String toString() {
		return "Mobile [mobid=" + mobid + ", brand=" + brand + ", model=" + model + ", price=" + price + "]";
	}

	

}
