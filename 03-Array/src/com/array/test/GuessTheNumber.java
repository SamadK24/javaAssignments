package com.array.test;

import java.util.Scanner;

public class GuessTheNumber {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		boolean play = true;

		while (play) {
			int chance = 5;
			int randomNumber = 1 + (int) (Math.random() * 100);
			while (chance > 0) {
				System.out.println("Enter your guess ");
				int user_guess = scanner.nextInt();
				chance--;

				if (user_guess == randomNumber) {
					System.out.println("you won");
				} else if (user_guess < randomNumber) {
					System.out.println("Sorry too low,you've " + chance + " attempts left");
				} else if (user_guess > randomNumber) {
					System.out.println("Sorry too high,you've " + chance + " attempts left");
				}

				if (chance > 0) {
					System.out.println("You have no chance left");
				} else {
					System.out.println("Game over");
					System.out.println("the correct number was " + randomNumber);
				}
			}

			System.out.println("Do you want to play again");
			System.out.println("1.Yes \n 2.No");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				play = true;
				break;

			case 2:
				play = false;
				System.out.println("Thanks for playing ! GoodBye");
				break;

			default:
				System.out.println("please choose from the given option");
				play = false;
			}

		}
	}
}
