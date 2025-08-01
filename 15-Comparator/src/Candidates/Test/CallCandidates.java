package com.swabhav.Candidates.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.swabhav.Candidates.Model.Candidates;
import com.swabhav.Candidates.Model.NameAge;

public class CallCandidates {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Candidates> candidates = new ArrayList<Candidates>();
		
		String name ;
		int number ;
		int age;
		scanner.nextLine();
		while(true) {
			try {
				System.out.println("Enter the number of candidates : ");
				number = scanner.nextInt();
				if(number <= 0 ) {
					System.out.println("It can't be 'Negative' and 'Zero'");
				}
				else {
					break;
				}
			} catch (InputMismatchException i) {
				System.out.println("Invalid value ! Enter input in number ");
				scanner.nextLine();
			}
		}
		
		for(int i=0 ; i<number ; i++) {
			System.out.println("Candidates : " + (i+1));
			
			while(true) {
				try {
					System.out.println("Enter Candidate name : ");
					name = scanner.nextLine().trim();
					
					if(name.isEmpty() || !name.matches("[a-zA-Z")) {
						System.out.println("We use character for input ! not number ");
					}
					else {
						break;
					}
				} catch (InputMismatchException l) {
					System.out.println("Invalid Input !");
					scanner.nextLine();
				}
			}
			
			while(true) {
				try {
					System.out.println("Enter Candidate age : ");
					age = scanner.nextInt();
					
					if(age <= 0) {
						System.out.println("Seriously! Negative age ! Enter proper (1-Above)");
					}
					else {
						break;
					}
				} catch (InputMismatchException l) {
					System.out.println("Invalid Input !");
					scanner.nextLine();
				}
			}
			
			Collections.sort(candidates , new NameAge());
		}
		
		for(Candidates c : candidates) {
			System.out.println(c);
		}
		
//		candidates.add(new Candidates("Zash", 23));
//		candidates.add(new Candidates("Yikas", 13));
//		candidates.add(new Candidates("Pash", 33));
//		candidates.add(new Candidates("Fkas", 2));
//		candidates.add(new Candidates("Aks", 2));
//		
//		System.out.println("Before ");
//		System.out.println(candidates);
//		
//		Collections.sort(candidates , new NameAge());
//		
//		System.out.println("After");
//		System.out.println(candidates);
	}
}
