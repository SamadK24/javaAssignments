package com.swabhav.threads.model;

public class ThreadUsingRunnableClass implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is running");
	}

}
