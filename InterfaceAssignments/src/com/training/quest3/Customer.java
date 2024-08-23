package com.training.quest3;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Mobile type either touchscreen or basicmobile");
		String type=sc.next();
		if(type.equalsIgnoreCase("touchscreen"))
		{
			SmartPhone smartphone= new TouchScreenMobile();
			smartphone.showApps();
			smartphone.cameraTypes();
			smartphone.call();
			smartphone.messaging();
		}
		else if(type.equalsIgnoreCase("basicmobile"))
		{
			FeaturePhone featurephone= new BasicMobile();
			featurephone.call();
			featurephone.messaging();
			
		}
		else
		System.out.println("Invalid Input");

	}

}
