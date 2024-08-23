package com.inter.trail;

public abstract class Vehicle implements IInsurance{
	
	private String model,brand;
	private double price;
	public Vehicle(String model, String brand, double price) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
	}
	void printDetails()
	{
		System.out.println("Model : "+model);
		System.out.println("Brand : "+brand);
		System.out.println("Price : "+price);
	}
	abstract void getMileage();
}
