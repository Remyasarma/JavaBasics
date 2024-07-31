package com.shristi.inherdemos;

public class Cuboid extends Figurine {

	@Override
	void volume(int x, int y) {
		double height = 5;
		System.out.println("Volume of Cuboid is : " + (x * y * height));

	}

}
