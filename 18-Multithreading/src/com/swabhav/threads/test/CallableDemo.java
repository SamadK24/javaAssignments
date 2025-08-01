package com.swabhav.threads.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
public static void main(String[] args) throws InterruptedException, ExecutionException {
	ExecutorService service= Executors.newCachedThreadPool();
	
	for(int i=0;i<5;i++) {
		Callable<String> task=()->{
			return "Result from : " + Thread.currentThread().getName();
		};
		Future<String> res=service.submit(task);
		System.out.println(res.get());
	}
}
}
