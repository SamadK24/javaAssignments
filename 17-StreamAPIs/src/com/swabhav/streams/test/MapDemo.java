package com.swabhav.streams.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {
public static void main(String[] args) {
	
//	//Given a list of strings, convert each to uppercase and print them
//	
//	List<String> names= Arrays.asList("amit","samad","Alaska");
//	System.out.println(names);
//	names.stream().map(str->str.toUpperCase()).collect(Collectors.toList()).forEach(res->System.out.println(res));
	
	//Given a list of integers, square each number and collect the result into a new list.
    
//	List<Integer> list= Arrays.asList(1,2,3,4,5);
//	System.out.println(list);
//	
//	List<Integer> list2= list.stream().map(num->num*num).collect(Collectors.toList());
//	System.out.println(list2);
	
	//Given a list of names, prefix each name with "Mr." or "Ms." and print the result.
//	List<String> names=Arrays.asList("Siyaahi","Vichaar","NaamSujal","Stan");
//	
//	System.out.println(names);
//	
//	List<String> names2=names.stream().map(str-> "Mr."+str).collect(Collectors.toList());
//	System.out.println(names2);
	
	//Given a list of product prices, apply 10% discount to each and collect the new prices.
	
	List<Integer> ogPrice=Arrays.asList(120,450,670,890,540);
	System.out.println(ogPrice);
	
	List<Double> newPrice=ogPrice.stream().map(i->i-i*0.1).collect(Collectors.toList());
	System.out.println(newPrice);
	
	
	
}
}
