package com.oops.abs;

public abstract class ButtonPhone extends Mobile {

	@Override
	void showFeatures() {
		System.out.println("Play Games");
		
	}

	@Override
	void call() {
		System.out.println("Call using number");

	}
	
	void playMusic() {
		System.out.println("Play music using SD card");
	}

}
