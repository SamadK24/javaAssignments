package com.swabhav.Movies.Model;

import java.util.Comparator;

public class Year_Descending implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		return o2.year - o1.year;
	}

}
