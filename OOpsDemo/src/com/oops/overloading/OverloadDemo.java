package com.oops.overloading;

public class OverloadDemo {

	public static void main(String[] args) {
		
		
		Shape shape= new Shape();
		shape.area(10);
		shape.area(10.5f);
		int rect=shape.area(10,20);
		System.out.println("Rectangle " +rect);
		System.out.println("Triangle "+shape.area(10,(20.5f)));
		
		/*Shape shape= new Shape();
		shape.area(10);
		shape.area((int)10.5f);
		int rect=(int)shape.area(10,20);
		System.out.println("Rectangle " +rect);
		System.out.println("Triangle "+shape.area(10, (int)(20.5f)));*/
	}

}
