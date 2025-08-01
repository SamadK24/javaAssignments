package com.swabhav.twodarray.test;

import java.util.Scanner;

import com.swabhav.array.model.Movies;

public class MoviesTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Movies[] movies = new Movies[2];

		for (int i = 0; i < 2; i++) {
			System.out.println("Enter movie details");
			System.out.println("Enter title of " + (i + 1) + " movie");
			String title = scanner.nextLine();
			System.out.println("Enter genre of " + (i + 1) + " movie");
			String genre = scanner.nextLine();

			movies[i] = new Movies(title, genre);
		}

		for (Movies result : movies) {

			result.display();

		}

	}
}
