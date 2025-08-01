package com.swabhav.streams.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*1. Given a list of integers, find the smallest number.
2. From a list of strings, find the one with the maximum length.
3. Given a list of Student objects, find the student who scored the highest marks.
4. Filter even numbers from a list and find the largest even number. */
public class MinMax {
public static void main(String[] args) {
	
	List<Integer> list=Arrays.asList(1,34,23,65,76,24,11,90,103);
	
	list.stream().filter(s->s%2==1).max(Comparator.comparing(Integer::intValue)).ifPresent(System.out::println);
	
	List<String> names=Arrays.asList("Samad","Nirmeet","Himali","Aexander","Raj");
	
	names.stream().max(Comparator.comparing(String::length)).ifPresent(System.out::println);
	
	
}
}
