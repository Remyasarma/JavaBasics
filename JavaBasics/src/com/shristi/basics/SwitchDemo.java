package com.shristi.basics;

public class SwitchDemo {
	public static void main(String[] args) {
		/*String fruit="Apple";
		switch(fruit.toUpperCase()) {
		case "ORANGE":
			System.out.println("Orange is good");
//			System.out.println("Eat an orange"); */
			
			
			
			String season ="Rainy";
			switch(season.toUpperCase()) {
			case "RAINY":
				System.out.println("Drink Tea");
				break;
			case "WINTER":
				System.out.println("drink soup");
				break;
			case "SUMMER":
				System.out.println("EAT AN ICECREAM");
				break;
			case "AUTUMN":
				System.out.println("enjoy the wind");
				break;
			default:
				System.out.println("No matching");
			}
		}
	}

