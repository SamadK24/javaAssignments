package com.swabhav.Movies.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.swabhav.Movies.Model.Movie;
import com.swabhav.Movies.Model.Title_Ascending;


public class MovieList {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Movie> movie = new ArrayList<Movie>();
		
		int number;
			
		while (true) {
			try {
				System.out.println("How many movies do you want : ");			
				number = scanner.nextInt();
				scanner.nextLine();
				if (number < 0) {
					System.out.println("Enter a positive number ");
				} 
				else if(number == 0) {
					System.out.println("Number must be greater then zero");
				}
				else {
					break;
				}
			} catch (InputMismatchException n) {
				System.out.println("Invalid Input ! Enter integer value only ");
				scanner.nextLine();
			}
		}
	
		String title ="";
		for (int i = 1; i <= number; i++) {
			while(true) {
				try {
					System.out.println("Enter title of the movie : ");
					title = scanner.nextLine().trim();
					
					if(!title.matches("[a-zA-Z ]+")) {
						System.out.println("title must contain letter only !");
					}
					else {
						break;
					}
				} catch (InputMismatchException l) {
					System.out.println("Invalid Input !");
					scanner.nextLine();
				}
			}
			
			System.out.println("Year : ");
			int year;
			
			while(true) {
				try {
					year = scanner.nextInt();
					scanner.nextLine();
					if(year <  1900 || year > 2051) {
						System.out.println("Enter a valid year (1900 - 2051) ");
					}
					else {
						break;
					}
				}catch(NumberFormatException e) {
					System.out.println(e + "Enter a valid year ");
				}
			}
			movie.add(new Movie(title , year));
		}
		
		Collections.sort(movie , new Title_Ascending());
		
		for(Movie m : movie) {
			System.out.println(m);
		}

//	movie.add(new Movie("Inception" , 2010));
//	movie.add(new Movie("Avatar" , 2009));
//	movie.add(new Movie("Interstellar" , 2014));
//	movie.add(new Movie("Avenger" , 2014));
//	movie.add(new Movie("Titanic" , 1997));
		
		//Collections.sort(movie , new Year_Descending());
		
//	Iterator<Movie> itre = movie.iterator();
//	while(itre.hasNext()) {
//		System.out.println(itre.next());
//	}

		scanner.close();
	}
}
