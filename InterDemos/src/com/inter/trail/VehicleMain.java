package com.inter.trail;

public class VehicleMain {

	public static void main(String[] args) {
		
		Vehicle vehicle =new Car("MG","Astor",200000,"suv");
		vehicle.printDetails();
		vehicle.coverageDetails();
		vehicle.getMileage();
		//((Car) vehicle).showType();
		
		Car car = (Car) vehicle;
		String[] accessories = car.showAccessories();
		for(String accessory : accessories)
			System.out.println(accessory);
		System.out.println();
		
		vehicle =new Bike("Bullet","Royal Enfield",150000,"5000");
		vehicle.printDetails();
		vehicle.coverageDetails();
		vehicle.getMileage();
		((Bike) vehicle).showCategory();
		
	
		
		
		

	}

}
