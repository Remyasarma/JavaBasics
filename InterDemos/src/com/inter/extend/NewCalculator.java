package com.inter.extend;

public interface NewCalculator {
	void add(int x, int y);

	// common to all implementation classes
	// can be overrridden
	// can be called only using the impl object
	default void product(int x, int y) {
		System.out.println(x * y);
	}

	// common to all implementation classes
	// cannot be overrridden
	// can be called only using the interface name
	static void proccessData() {
		System.out.println("Processing....");
	}
}
