package com.inter.trail;

public class Bike extends Vehicle {
	
	String capacity;
	
	public Bike(String model, String brand, double price, String capacity) {
		super(model, brand, price);
		this.capacity = capacity;
	}

	@Override
	public void coverageDetails() {
		System.out.println("Coverage for engine");

	}

	@Override
	void getMileage() {
		System.out.println("Mileage is ok");
	}
	void showCategory()
	{
		if(capacity.equals("1000cc"))
			System.out.println("Terrian Bike");
		else if(capacity.equals("500cc"))
			System.out.println("Sports Bike");
		else
			System.out.println("Regular Bike");
	}

}
