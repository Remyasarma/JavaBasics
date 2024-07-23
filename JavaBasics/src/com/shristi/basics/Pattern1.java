package com.shristi.basics;

public class Pattern1 {

	public static void main(String[] args) {
		int nums =4;
		for (int i = 1; i <= nums; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            if (i < nums) {
                System.out.print(" "); 
            }
        }

	}

}
