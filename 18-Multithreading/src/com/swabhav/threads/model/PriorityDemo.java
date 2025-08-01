package com.swabhav.threads.model;

public class PriorityDemo extends Thread {
 
	
	public  PriorityDemo(String name, int priority) {
		setName(name);
		setPriority(priority);
	}
	
	public void run() {
		
		for(int i=1;i<=5;i++) {
			System.out.println(getName() + " : "+ i);
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.getStackTrace();
			}
		}
		
	}
}
