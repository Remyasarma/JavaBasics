package com.streamd.basics;

import java.util.Optional;

public class OptDemo {

	public static void main(String[] args) {
		Optional<String> opt =Optional.ofNullable("Great day");
		Optional<String> opt1 =Optional.ofNullable(null);
		//System.out.println(opt.get());
		//System.out.println(opt1.get());
		
		if(opt.isPresent())
			System.out.println(opt.get());
		if(opt.isEmpty())
			System.out.println("No value present");
		
		if(opt1.isPresent())
			System.out.println(opt1.get());
		if(opt1.isEmpty())
			System.out.println("No value present");
		
		opt.ifPresent(System.out::println);
		opt.ifPresentOrElse(str->System.out.println(str), 
				()->System.out.println("Heloo"));
		
		opt1.ifPresent(System.out::println);
		opt1.ifPresentOrElse(str->System.out.println(str), 
				()->System.out.println("Heloo"));
	}
	

}
