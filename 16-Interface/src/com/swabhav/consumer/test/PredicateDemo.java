package com.swabhav.consumer.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
public static void main(String[] args) {
	
	//even checker
	Predicate<Integer> isEvenChecker= num-> num%2==0;
	System.out.println(isEvenChecker.test(46));
	
	//odd checker
	Predicate<Integer> isOddChecker = num-> num%2==1;
	System.out.println(isOddChecker.test(4));
	
	//filter example
	List<String> list= Arrays.asList("","Java"," ");
	Predicate<String> isValidString= str-> str!=null&& !str.trim().isEmpty();
	
	List<String> validStrings= new ArrayList<>();
	for(String str : list) {
		if(isValidString.test(str)) {
			validStrings.add(str);
		}
	}
	System.out.println(validStrings);
	
			
}
}
