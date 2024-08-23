package com.oops.abs;

public class PhoneShop {

	public static void main(String[] args) {
		Mobile mobile=new SmartPhone();
		mobile.showFeatures();
		mobile.call();
		mobile.sendMoney();
		mobile.showCamaeraType();
		System.out.println(mobile.accessories);
		
		SmartPhone smartphone= (SmartPhone) mobile;
		smartphone.watchMovies();
		
		mobile=new FeaturePhone();
		mobile.sendMoney();
		mobile.showFeatures();
		mobile.call();
		mobile.showCamaeraType();
		
		ButtonPhone buttonphone = (ButtonPhone) mobile;
		buttonphone.playMusic();
		
		FeaturePhone featurephone=(FeaturePhone) mobile;
		featurephone.showGames();
		
		
		

	}

}
