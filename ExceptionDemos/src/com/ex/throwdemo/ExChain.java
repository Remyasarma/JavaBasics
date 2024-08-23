package com.ex.throwdemo;

public class ExChain {
	public static void main(String[] args) {
		System.out.println("In main");
		try {
			A.print();
		} catch (Exception e) {
			System.out.println("Error handled");
		}
		System.out.println("Main done");

	}
}

class A {
	static void print() throws Exception {
		System.out.println("In A");
		B.check();
		System.out.println("A Done");
	}
}

class B {
	static void check() throws Exception {
		System.out.println("In B");
		C.show();
		System.out.println("B Done");
	}
}

class C {
	static void show() throws Exception {
		System.out.println("In C");
		int x = 20;
		if (x > 10)
			throw new Exception();
		System.out.println("C Done");
	}
}