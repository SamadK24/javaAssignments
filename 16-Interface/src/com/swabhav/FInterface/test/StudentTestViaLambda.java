package com.swabhav.FInterface.test;

import com.swabhav.FInterface.model.IStudent;
import com.swabhav.FInterface.model.IStudent2;
import com.swabhav.FInterface.model.IStudent3;
import com.swabhav.FInterface.model.StudentViaAnonymousClass;

public class StudentTestViaLambda {
public static void main(String[] args) {
	
	IStudent student = ()-> System.out.println("Hello");
	student.greet();
	
	IStudent2 student2 = msg->msg;
	System.out.println(student2.display("HII"));
	
	IStudent3 student3= (a,b) -> a+b;
	System.out.println(student3.add(2, 4));
	
	StudentViaAnonymousClass student4 = new StudentViaAnonymousClass() {

		@Override
		public void greet() {
			System.out.println("hii");
			
		}
		
	};
	student4.greet();
		
	
}
}
