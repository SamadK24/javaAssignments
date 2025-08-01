package com.swabhav.threads.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorDemo {
public static void main(String[] args) throws InterruptedException {
	
	ExecutorService service= Executors.newCachedThreadPool();
	
	Runnable task1=()-> {
		System.out.println("Task 1 is done by: "+ Thread.currentThread().getName());
	};
	
	Runnable task2=()-> {
		System.out.println("Task 2 is done by: "+ Thread.currentThread().getName());
	};
	
	Runnable task3=()-> {
		System.out.println("Task 3 is done by: "+ Thread.currentThread().getName());
	};
	
	Runnable task4=()-> {
		System.out.println("Task 4 is done by: "+ Thread.currentThread().getName());
	};
	
	Runnable task5=()-> {
		System.out.println("Task 5 is done by: "+ Thread.currentThread().getName());
	};
	
	service.submit(task1);
	Thread.sleep(15000);
	service.submit(task2);
	Thread.sleep(500);
	service.submit(task3);
	Thread.sleep(500);
	service.submit(task4);
	Thread.sleep(500);
	service.submit(task5);
	
	service.awaitTermination(5, TimeUnit.SECONDS);
	service.submit(task5);
	service.shutdown();
	
	
	
	
}
}
