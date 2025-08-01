package com.swabhav.Movies.Model;

import java.util.Comparator;

public class Title_Ascending implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		if(o2.year != o1.year) {
			return o2.year - o1.year;
		}
		return o1.title.compareToIgnoreCase(o2.title);
	}

}
