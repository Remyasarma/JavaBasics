package com.shristi.inherdemos;

public class Cube extends Figurine {

	@Override
	void volume(int x, int y) {
		System.out.println("Volume of cube is : " + (x * x * y));
	}

}
