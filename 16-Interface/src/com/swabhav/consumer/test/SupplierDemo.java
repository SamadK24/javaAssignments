package com.swabhav.consumer.test;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierDemo {
public static void main(String[] args) {
	
	Supplier<Double> random = ()->Math.random();
	System.out.println(random.get());
	
	Supplier<LocalTime> currentTime= ()->LocalTime.now();
	System.out.println(currentTime.get());
	
	ArrayList<String> list = new ArrayList();
	list.add("User");
	list.add("Admin");
	list.add("Manager");
	
	Supplier<ArrayList<String>> l=()->list;
	System.out.println(l.get());
}
}
