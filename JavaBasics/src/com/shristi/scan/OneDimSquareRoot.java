package com.shristi.scan;

import java.util.Arrays;
import java.util.Scanner;

public class OneDimSquareRoot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] array = new int[4];
		System.out.println("Enter the array elements");
		array[0]=sc.nextInt();
		array[1]=sc.nextInt();
		array[2]=sc.nextInt();
		array[3]=sc.nextInt();
		double[] squareRoots = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            squareRoots[i] = Math.sqrt(array[i]);
        }
        System.out.println("Original numbers: " + Arrays.toString(array));
        System.out.println("Square roots: " + Arrays.toString(squareRoots));
        sc.close();
	}
}
