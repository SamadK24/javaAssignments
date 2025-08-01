package com.swabhav.StudentSortingSystem.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.swabhav.StudentSortingSystem.model.IDAscComparator;
import com.swabhav.StudentSortingSystem.model.IDDescComparator;
import com.swabhav.StudentSortingSystem.model.Student;

public class StudentTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(24, "Samad"));
		list.add(new Student(2, "Vichaar"));
		list.add(new Student(124, "Siyaahi"));
		list.add(new Student(234, "NaamSujal"));

		while (true) {

			System.out.println("Choose the sorting citeria");
			System.out.println("1.Sort By id");
			System.out.println("2.Sort By Name");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				int check = 0;
				while (check == 0) {
					System.out.println("1.Sort By id ascending");
					System.out.println("2.Sort By id descending");
					System.out.println("3. exit");
					int choice1 = scanner.nextInt();

					switch (choice1) {
					case 1:
						Collections.sort(list, new IDAscComparator());
						System.out.println(list);
						break;

					case 2:
						Collections.sort(list, new IDDescComparator());
						System.out.println(list);
						break;

					case 3:
						check = 1;
						break;
					}

				}
			}
		}
	}
}
