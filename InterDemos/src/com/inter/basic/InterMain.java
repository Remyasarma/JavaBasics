package com.inter.basic;

public class InterMain {

	public static void main(String[] args) {
		IBookInter bookInter = new HardBookImpl();
		bookInter.showBooks();
		String[] authors = bookInter.showFeaturedAuthors();
		for(String author:authors)
			System.out.println(author);
		HardBookImpl bookImpl = (HardBookImpl) bookInter;
		bookImpl.checkData();
		
		bookInter = new EbookImpl();
		bookInter.showBooks();
		authors = bookInter.showFeaturedAuthors();
		for(String author:authors)
			System.out.println(author);

	}

}
