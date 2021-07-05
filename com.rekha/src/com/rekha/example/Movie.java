package com.rekha.example;

public class Movie implements Comparable<Movie> {
	public String movieName;
	public int rating;
	
	
	public Movie() {
		this.movieName = "#UnknownMovieName";
		this.rating = 0;
	}
	
	
	
	public Movie(String movieName, int rating) {
		super();
		this.movieName = movieName;
		this.rating = rating;
	}



	@Override
	public String toString() {
		return String.format("%20s %5d", this.movieName, this.rating);
	
	}



	@Override
	public int compareTo(Movie another) {
     // if(this.rating>another.rating)
    	//  return 1;
      //else if(this.rating<another.rating)
	  //return -1;
      
      //else
    	//  return 0;
	
	if(this.movieName.compareTo(another.movieName) > 0)
		return  1;
	else if(this.movieName.compareTo(another.movieName) < 0)
		return  -1;
	else
		return 0;
	
	}



	
	
	

}
