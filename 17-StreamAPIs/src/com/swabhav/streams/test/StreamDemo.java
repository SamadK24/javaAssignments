package com.swabhav.streams.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
public static void main(String[] args) {
	
//	List<Integer> list= Arrays.asList(1,23,43,56,78,98);
//	System.err.println(list);
//	
//	List<Integer> streamObject= list.stream().filter(num->num%2==0).collect(Collectors.toList());
//	System.out.println(streamObject);
//	
//	list.stream().filter(i->i%2==1).collect(Collectors.toList()).forEach(res ->System.out.println(res));
//    list.stream().filter(i->i%2==1).collect(Collectors.toList()).forEach(System.out::println);
    
    // Given a list of names, print only those that start with the letter 'A'.
    
    List<String> name= Arrays.asList("akshay","Raj","Samad","Alister");
    System.out.println(name);
    
    name.stream().filter(str->str.startsWith("A") || str.startsWith("a")).collect(Collectors.toList()).forEach(res->System.out.println(res));
    
    //Given a list of strings, filter out all empty or blank strings.
    
    List<String> list= Arrays.asList("akshay","Raj","Samad","Alister",""," ");
    System.out.println(list);
    
    list.stream().filter(str->!str.isEmpty()).collect(Collectors.toList()).forEach(res->System.out.println(res));
    
    //Select only passed student from a list.
    List<Integer> list2=Arrays.asList(23,56,43,89,90,32);
    System.out.println(list2);
    
    list2.stream().filter(num->num>45).collect(Collectors.toList()).forEach(res->System.out.println(res));
    
    
    
    
	}
}

