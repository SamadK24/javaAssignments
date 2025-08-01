package com.swabhav.threads.test;

import com.swabhav.threads.model.ThreadUsingThreadClass;

public class ThreadUsingThreadClassTest {
public static void main(String[] args) {
	
	
   ThreadUsingThreadClass thread0= new ThreadUsingThreadClass();
   thread0.start();
   
   ThreadUsingThreadClass thread1= new ThreadUsingThreadClass();
   thread1.start();
   
   ThreadUsingThreadClass thread2= new ThreadUsingThreadClass();
   thread2.start();
   thread2.run();
   
   
}
}
