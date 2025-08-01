package com.swabhav.array.model;

public class Movies {
	String title;
	String genre;

	public Movies(String title, String genre) {
		this.title = title;
		this.genre = genre;
	}

	public void display() {
		if(genre.equalsIgnoreCase("action")) {
			System.out.println("Title " + title + " genre " + genre);
		}
		
	}
}
