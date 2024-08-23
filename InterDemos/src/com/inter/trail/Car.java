package com.inter.trail;

public class Car extends Vehicle implements IAccessories {

	String type;

	public Car(String model, String brand, double price, String type) {
		super(model, brand, price);
		this.type = type;
	}

	@Override
	public void coverageDetails() {
		System.out.println("Coverage for parts and engine");
	}

	@Override
	public String[] showAccessories() {
		return new String[] { "Car Cover", "Music System", "Car Refreshner" };
	}

	@Override
	void getMileage() {
		System.out.println("Car : 50 km/hr");
	}

	void showType() {
		if (type.equalsIgnoreCase("suv"))
			System.out.println("Comfort car");
		else if (type.equalsIgnoreCase("sedan"))
			System.out.println("Luxury car");
		else
			System.out.println("Normal car");

	}
}
