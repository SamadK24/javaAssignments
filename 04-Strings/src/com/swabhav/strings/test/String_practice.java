package com.swabhav.strings.test;

public class String_practice {
public static void main(String[] args) {
	String s1="Hello";
	String s2="Hello";
	
	System.out.println(s1==s2);
	System.out.println(s1.hashCode()); //hashcode is same
	System.out.println(s2.hashCode()); //this is created in string pool and if the values of both string are same then it just refers
	
	String s3=new String("Hello");// objects are created in heap memory
	String s4=new String("Hello");// string is a immutable class
	
	System.out.println(s3==s4);
}
}
