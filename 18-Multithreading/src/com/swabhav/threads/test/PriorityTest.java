package com.swabhav.threads.test;

import com.swabhav.threads.model.PriorityDemo;

public class PriorityTest {
public static void main(String[] args) {
	new PriorityDemo("alpha",5).start();
	new PriorityDemo("gamma",9).start();
	new PriorityDemo("beta",1).start();
	
}
}
