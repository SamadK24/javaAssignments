package com.swabhav.streams.test;

import java.util.Arrays;
import java.util.List;

public class CountDemo {
public static void main(String[] args) {
	
//	List<Integer> list=Arrays.asList(34,56,12,11,89,90);
//	
//	long count=list.stream().filter(i->i>20).distinct().count();
//	System.out.println(count);
//	
//	List<String> names=Arrays.asList("akss","samad","Alister","adnan");
//	long cnt= names.stream().map(str->str.toUpperCase()).filter(str1->str1.startsWith("A")).count();
//	System.out.println(cnt);
	
	Integer[] marks= {23,56,78,90,45};
	
	Arrays.stream(marks).filter(num->num<50);

}
}
