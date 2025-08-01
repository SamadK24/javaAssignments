package com.swabhav.threads.test;

import com.swabhav.threads.model.ThreadUsingRunnableClass;

public class ThreadUsingRunnableClassTest {
public static void main(String[] args) {
	
	Thread thread0= new Thread(new ThreadUsingRunnableClass());
	thread0.start();
}
}
