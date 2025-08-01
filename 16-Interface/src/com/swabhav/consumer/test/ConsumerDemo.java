package com.swabhav.consumer.test;

import java.util.function.Consumer;

public class ConsumerDemo {
public static void main(String[] args) {
	
	Consumer<Integer> consumer = i-> System.out.println(i);
	consumer.accept(54);
	
	Consumer<String> consumer1= str-> System.out.println( str.toLowerCase()); 
	consumer1.accept("AB");
	
	
}
}
