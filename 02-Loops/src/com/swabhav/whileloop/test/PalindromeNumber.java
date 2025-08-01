package com.swabhav.whileloop.test;

public class PalindromeNumber {
public static void main(String[] args) {
		int originalnumber=1221;
		int temporarynumber=originalnumber;
		 int reversenumber=0;
		 int lastdigit;
		 
		 while(originalnumber!=0) {
			 lastdigit=originalnumber%10;
			 reversenumber=reversenumber*10+lastdigit;
			 originalnumber=originalnumber/10;
			 
		 }
		 if(temporarynumber==reversenumber) {
			 System.out.println("The given number is palindrome");
		 }
		 else {
			 System.out.println("The given number is not palindrome");
		 }
	}
}

