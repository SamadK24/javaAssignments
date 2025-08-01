package com.swabhav.threads.model;

public class Counter extends Thread {
   public static int count=0;
   
   public synchronized void increment()
   {
	   count++;
   }
   
   public void run() {
	   for(int i=0;i<2000;i++) {
		   increment();
	   }
   }
}
