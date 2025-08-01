package com.swabhav.strings.test;

import java.util.Scanner;

public class CheckIfReverseOfEachOther {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Enter string 1 :");
	String s1=scanner.nextLine();
	System.out.println("Enter string 2 :");
	String s2=scanner.nextLine();
	
	StringBuilder stringbuilder=new StringBuilder(s1);
	StringBuilder stringbuilder2=new StringBuilder(s2);
	
	stringbuilder=stringbuilder.reverse();
//	System.out.println(stringbuilder.compareTo(stringbuilder2));
	
	int res= stringbuilder.compareTo(stringbuilder2);
	System.out.println(res);
	
	
	
	
	
	
	
}
}
