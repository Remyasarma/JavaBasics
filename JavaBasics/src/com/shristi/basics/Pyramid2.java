package com.shristi.basics;

public class Pyramid2 {

	public static void main(String[] args) {
		int rows = 5;
		for (int i = rows; i >= 1; i--) 
		{
			for (int j = rows; j >1; j--) 
			{
                System.out.print(" ");
            }
            
            for (int k = 1; k<=i; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
		}

	}

}
