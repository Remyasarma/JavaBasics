package com.shristi.basic;

import java.util.ArrayList;

public class ArrListDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Raju");
		list.add(100);
		System.out.println(list);
		for(Object obj:list)
		{
			System.out.println(obj);
		}

	}

}
