package com.oops.abs;

public class SmartPhone extends Mobile {

	String accessories ="Charger and guard";
	@Override
	void showFeatures() {
		System.out.println("Play Games");
		System.out.println("Download music");
	}

	@Override
	void call() {
		System.out.println("Call using number/whatsapp/apps");

	}

	@Override
	void sendMoney() {
		System.out.println("Send money using cards/upis");
	}
	
	void watchMovies()
	{
		System.out.println("Watch music using apps");
	}

}
