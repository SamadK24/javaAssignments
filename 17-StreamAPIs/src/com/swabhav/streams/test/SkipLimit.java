package com.swabhav.streams.test;

import java.util.Arrays;
import java.util.List;

/*4. Given a list of products, skip the first 2 products priced above ₹500 and print the rest.
5. From a list of words, filter words longer than 3 letters and skip the first 3 of them.
3. From a list of integers, filter even numbers, limit to the first 4 even numbers, and calculate their total.
4. From a list of words, sort by descending length and display only the first 3 longest words */


public class SkipLimit {
public static void main(String[] args) {
	
	List<Integer> product=Arrays.asList(200,457,300,500,650,220,780,900,1000);
	product.stream().filter(s->s>500).skip(2).forEach(System.out::println);
	
	List<String> names= Arrays.asList("Samad","Akash","om","Raj","Akexander","Napolean","Durgesh");
	names.stream().filter(str->str.length()>3).skip(3).forEach(System.out::println);
	
	List<Integer> number=Arrays.asList(34,53,21,33,78,90,24);
	Integer sum=number.stream().filter(num->num%2==0).limit(4).reduce(0,(a,b)->a+b);
	System.out.println(sum);
	
	
}
}
