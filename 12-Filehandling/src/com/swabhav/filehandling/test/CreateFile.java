package com.swabhav.filehandling.test;

import java.io.File;
import java.io.IOException;

public class CreateFile {
public static void main(String[] args) throws IOException {
	
	File file=new File("demo.pdf");
	
	if(file.createNewFile()) {
		System.out.println("File created successfully "+file.getName());
	}
	else {
		System.out.println("File already exists");
	}
}
}
