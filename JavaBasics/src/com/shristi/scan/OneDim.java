package com.shristi.scan;

import java.util.Scanner;

public class OneDim {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int[] array = new int[4];
		System.out.println("Enter the array elements");
		array[0]=sc.nextInt();
		array[1]=sc.nextInt();
		array[2]=sc.nextInt();
		array[3]=sc.nextInt();
		System.out.println("Array elements are");
		for(int elements:array)
		{
			System.out.print(elements+ " ");
		}
		int sum=0;
		double avg=0;
		for(int elements:array)
		{
			sum=sum+elements;
		}
		avg=sum/array.length;
		System.out.println();
		System.out.println("Sum of array elements is "+sum);
		System.out.println("Average of array elements is "+avg);
	sc.close();
	}

}
