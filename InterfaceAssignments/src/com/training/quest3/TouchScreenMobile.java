package com.training.quest3;

public class TouchScreenMobile extends BasicMobile implements SmartPhone {

	@Override
	public void showApps() {
		String[] apps = {"Gpay","Whatsapp","Hotstar","Prime","Photos"};
		for(String app :apps)
		{
			System.out.println("Apps are : "+app);
		}

	}

	@Override
	public void cameraTypes() {
		String[] types = {"Selfie","Rear"};
		for(String type :types)
		{
			System.out.println("Camera types are : "+type);
		}
	}

	@Override
	public void call() {
		System.out.println("Call using TouchScreenMobile");
	}

	@Override
	public void messaging() {
		System.out.println("Whatsapp messaging");
	}

}
