package com.swabhav.Movies.Model;

public class Movie {
	String title;
	int year;
	
	public Movie(String title , int year) {
		this.title = title;
		this.year = year;
	}

	@Override
	public String toString() {
		return "[title= " + title + ", year= " + year + "]";
	}
	
	
}
