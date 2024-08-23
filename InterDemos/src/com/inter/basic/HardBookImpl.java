package com.inter.basic;

public class HardBookImpl implements IBookInter{
	
	@Override
	public void showBooks() {
		System.out.println("Technical ,Learning");

	}

	@Override
	public String[] showFeaturedAuthors() {
		return new String[] {"Remya","Varun"};
	}
	public void checkData()
	{
		System.out.println("Checking .....");
	}

}
