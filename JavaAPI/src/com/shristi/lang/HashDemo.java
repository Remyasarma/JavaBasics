package com.shristi.lang;

public class HashDemo {

	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle("A100","Audi",2345678);
		Vehicle vehicle2 = new Vehicle("A100","Honda",2345678);
		Vehicle vehicle3 = new Vehicle("A100","SUV",2345678);
		
		System.out.println(vehicle1==vehicle2);
		System.out.println(vehicle2==vehicle3);
		System.out.println(vehicle3==vehicle1);
		
		System.out.println(vehicle1.equals(vehicle2));
		System.out.println(vehicle2.equals(vehicle3));
		System.out.println(vehicle3.equals(vehicle1));
		
		System.out.println(vehicle1.hashCode());
		System.out.println(vehicle2.hashCode());
		System.out.println(vehicle3.hashCode());

	}

}
