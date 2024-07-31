package com.shristi.inherdemos;

public class Oval extends Figurine {

	@Override
	void volume(int x, int y) {
		double thickness = 5;
		System.out.println("Volume of Oval is : " + (Math.PI * (x / 2) * (y / 2) * thickness));
	}

}
