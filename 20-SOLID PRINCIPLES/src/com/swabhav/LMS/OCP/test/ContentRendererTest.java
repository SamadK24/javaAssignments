package com.swabhav.LMS.OCP.test;

import java.util.Scanner;

import com.swabhav.LMS.OCP.model.Article;
import com.swabhav.LMS.OCP.model.Podcast;
import com.swabhav.LMS.OCP.model.Quiz;
import com.swabhav.LMS.OCP.model.Video;

public class ContentRendererTest {
	public static void main(String[] args) {
		getType get = new getType();
		

		

		Scanner scanner = new Scanner(System.in);
		boolean isExit = false;
		while (!isExit) {
			System.out.println("Enter the multiMedia type \n1.Video\n2.Article\n3.Quiz\n4.Podcast\n5.exit");
			int choice = scanner.nextInt();
			
			switch (choice) {
			case 1:
				get.getType(new Video());
				break;
			case 2:
				get.getType(new Article());
				break;
				
			case 3:
				get.getType(new Quiz());
				break;
			case 4:
				get.getType(new Podcast());
				break;
			case 5:
				System.out.println("theank u");
				isExit=true;
				break;
			default:
				break;
			}

		}
	}
}
