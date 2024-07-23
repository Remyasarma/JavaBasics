package com.shristi.basics;

import java.util.Scanner;

public class ScanDemo {

	public static void main(String[] args) {
		System.out.println("Enter the Details");
		Scanner sc=new Scanner(System.in);
		String uname =sc.nextLine();
		System.out.println("User name "+uname);
		int userId =sc.nextInt();
		System.out.println("User Id "+userId);
		sc.nextLine();
		String place =sc.nextLine();
		System.out.println("City "+place);
		Double sal = sc.nextDouble();
		System.out.println("Salary "+sal);
		sc.close();
		//sc.next() - llegalStateException(After closing the scanner resource we cannot access any methods and if we access any methods it will throw this error)
		

	}

}
