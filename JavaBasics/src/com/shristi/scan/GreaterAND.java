package com.shristi.scan;

import java.util.Scanner;

public class GreaterAND {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int a = sc.nextInt();
		int b=sc.nextInt();
		int c= sc.nextInt();
		if(a<b && a<c)
			System.out.println("Smallest number is "+a);
		else if(b<a && b<c)
			System.out.println("Smallest number is "+b);
		else
			System.out.println("Smallest number is "+c);
	sc.close();
	}

}
