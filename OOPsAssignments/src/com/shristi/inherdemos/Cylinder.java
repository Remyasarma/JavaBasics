package com.shristi.inherdemos;

public class Cylinder extends Figurine {

	@Override
	void volume(int x, int y) {

		System.out.println("Volume of Cylinder is : " + (Math.PI * (Math.pow(x, 2)) * y));
	}

}
