package com.swabhav.assignments.test;

import java.util.Scanner;

public class TreasureIsland {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to Treasure Island. Your Mission is to find the treasure.");

		System.out.println("You can make 2 move Either Left or Right");
		System.out.println("1.Move Right:-");
		System.out.println("2.Move Left:-");
		System.out.print("Enter Your choice:-");
		int movement = scanner.nextInt();

		switch (movement) {
		case 1:
			if (movement == 1) {
				System.out.println("Fall into a hole. ! Game Over");
			}
			break;

		case 2:
			System.out.println("1.Swim:-");
			System.out.println("2.Wait:-");
			System.out.print("Enter Your choice:-");
			int movement2 = scanner.nextInt();

			if (movement2 == 1) {
				// swim or anything else you are attacked .
				System.out.println("Attacked by trout . Game Over");
			}

			if (movement2 == 2) {
				// if wait move forward
				System.out.println("Wait");

				if (movement2 == 2) {
					System.out.println("Which door you want to go:--");
					System.out.println("1.Red");
					System.out.println("2.Blue");
					System.out.println("3.Yellow");
					int choice = scanner.nextInt();

					switch (choice) {
					case 1:
						System.out.println("Burned by fire. Game over");
						break;

					case 2:
						System.out.println("Eaten by beasts. Game Over.");
						break;

					case 3:
						if (choice == 3) {
							System.out.println("You Win!");
							break;
						}

					default:
						System.out.println("Game Over");
					}
				}
			}
		}
		scanner.close();
	}
}
