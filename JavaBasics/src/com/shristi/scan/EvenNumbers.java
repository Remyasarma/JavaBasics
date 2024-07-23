package com.shristi.scan;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the last range");
		int ran = sc.nextInt();
		int i=1;
		System.out.println("Even numbers till "+ran+" are below");
		while(i<=ran)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}		
		sc.close();
	}

}
