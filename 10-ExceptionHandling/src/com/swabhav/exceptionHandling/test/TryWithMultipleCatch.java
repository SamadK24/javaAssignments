package com.swabhav.exceptionHandling.test;

import java.util.Scanner;

public class TryWithMultipleCatch {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] array = new String[2];

		try {
//			for (int i = 0; i < array.length; i++) {
//				System.out.println("Name :");
//				array[i] = scanner.nextLine();
//				System.out.println(array[i].length()]);

			String name = null;
			System.out.println(name.length());
//			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (NullPointerException e) {
			System.out.println("Null:   " + e);
		} catch (Exception e) {
			System.out.println(e);
		}
		scanner.close();

	}
}
