package com.streamd.basics;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		List<String> courses = Arrays.asList("Java","junit","css","Html","Angular","JavaScript");
		
		//findFirst
		//courses.stream().filter(str->str.startsWith("S")).forEach(str->System.out.println(str.toUpperCase()));
		Optional<String> opt =courses.stream().filter(str->str.startsWith("S")).findFirst();
		
		if(opt.isPresent())System.out.println(opt.get());
		
		String str= courses.stream().filter(str1->str1.startsWith("S")).findFirst().orElse("Share Point");
		System.out.println(str);
		
		str= courses.stream().filter(str1->str1.startsWith("S")).findFirst().orElseGet(()->check());
		System.out.println(str);
		
		str= courses.stream().filter(str1->str1.startsWith("S")).findFirst().orElseThrow(()-> new ArithmeticException("No data found"));
		System.out.println(str);
		
	}
	public static String check() {
		return "Welcome".toUpperCase();
}

}
