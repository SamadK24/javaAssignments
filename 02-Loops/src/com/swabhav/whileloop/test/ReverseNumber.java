package com.swabhav.whileloop.test;

public class ReverseNumber {
	public static void main(String[] args) {
		int originalnumber=12345;
		 int reversenumber=0;
		 int lastdigit;
		 System.out.println("The original number is "+originalnumber);
		 while(originalnumber!=0) {
			 lastdigit=originalnumber%10;
			 reversenumber=reversenumber*10+lastdigit;
			 originalnumber=originalnumber/10;
			 
		 }
		 System.out.println("The reverse number is "+reversenumber);
	}
 
}
