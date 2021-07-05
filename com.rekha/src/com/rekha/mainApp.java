package com.rekha;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.rekha.example.Movie;

public class mainApp {

	public static void main(String[] args) {
		ArrayList numbers = new ArrayList();
		numbers.add(18);
		numbers.add(27);
		numbers.add(67);
		numbers.add(45);
		numbers.add(30);
		
		
		Collections.sort(numbers);
		
		System.out.println("ArrayList Number after sorting");
		
		System.out.println(numbers);
		
		
		List cities = Arrays.asList("sangali", "Pune", "Satara", "Kolhapur", "Solapur");
		
		
        Collections.sort(cities);
		
		System.out.println("ArrayList cities after sorting");
		
		System.out.println(cities);
		
		ArrayList <Movie>movieList = new ArrayList();
		
		movieList.add(new Movie("Titanic",8));
		
		movieList.add(new Movie("Life of pi",5));

		movieList.add(new Movie("Avenger",7));

		movieList.add(new Movie("Transformer",6));

		movieList.add(new Movie("Aianaconda",5));
		
		
      System.out.println("ArrayList Movie List ");
      for(Movie m:movieList)
      {
    	  System.out.println(m);
      }
		//sorting movie list in ascending order
      Collections.sort(movieList);
      
      System.out.println("ArrayList Movie List after Sorting....");
      for(Movie m:movieList)
      {
    	  System.out.println(m);
      }
      
		
		
		

		
	}

}
