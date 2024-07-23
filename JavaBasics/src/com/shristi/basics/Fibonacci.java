package com.shristi.basics;

public class Fibonacci {

	public static void main(String[] args) {

		int range=15;
		int firstNum =0, secondNum=1;
		System.out.println("Fibonacci numbers upto range " + range);

		for (int i = 1; i <= range; ++i) {
			System.out.print(firstNum + " ");
		    int nextNum = firstNum + secondNum;
		    firstNum = secondNum;
		    secondNum = nextNum;
		}
	}

}
