package com.shristi.basic;

import java.util.ArrayList;
import java.util.Iterator;

public class CustomMovie {

	public static void main(String[] args) {
		Movie movie1 = new Movie("RDX",100,"Malayalam","11:45AM");
		Movie movie2 = new Movie("Little Hearts",101,"Malayalam","11:45AM");
		Movie movie3 = new Movie("Charlie",102,"Malayalam","11:45AM");
		Movie movie4 = new Movie("Jailer",103,"Tamil","11:45AM");
		Movie movie5 = new Movie("Jai Ganesh",104,"Malayalam","11:45AM");
		ArrayList<Movie> arr = new ArrayList<Movie>();
		arr.add(movie1);
		arr.add(movie2);
		arr.add(movie3);
		arr.add(movie4);
		arr.add(movie5);
		Iterator iterator = arr.iterator();  
        System.out.println("List elements : "); 
        for(Movie movie :arr)
        {
        	System.out.println(movie);
        }
        System.out.println(); 
        System.out.println("Getting only movie language");
        for(Movie movie :arr)
        {
        	System.out.println(movie.getMobieName());
        }
	}

}
