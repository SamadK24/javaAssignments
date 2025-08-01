package com.swabhav.consumer.test;

import java.util.function.Function;

public class FunctionDemo {
public static void main(String[] args) {
	
	Function<Integer,Integer> function = num -> num*num;
	System.out.println(function.apply(5));
}
}
