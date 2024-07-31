package com.shristi.inherdemos;

import java.util.Scanner;

public class OverMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the L1 and L2 of cube");
		int l1 = sc.nextInt();
		int l2 = sc.nextInt();
		System.out.println("Enter the lenght and breadth of Cuboid");
		int length = sc.nextInt();
		int breadth = sc.nextInt();
		System.out.println("Enter the D1 and D2 of Oval");
		int d1 = sc.nextInt();
		int d2 = sc.nextInt();
		System.out.println("Enter the radius and height of Cylinder");
		int r = sc.nextInt();
		int h = sc.nextInt();
		Figurine figurine = new Cube();
		figurine.volume(l1, l2);
		figurine = new Cuboid();
		figurine.volume(length, breadth);
		figurine = new Oval();
		figurine.volume(d1, d2);
		figurine = new Cylinder();
		figurine.volume(r, h);

	}

}
