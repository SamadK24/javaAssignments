package com.swabhav.threads.model;

public class Printer extends Thread {

	public void print(String doc) {
		synchronized(this) {
			System.out.println(Thread.currentThread().getName()+ "printing: "+doc);
		}
	}

}
