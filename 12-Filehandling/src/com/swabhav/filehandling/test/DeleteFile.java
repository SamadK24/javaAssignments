package com.swabhav.filehandling.test;

import java.io.File;

public class DeleteFile {
public static void main(String[] args) {
	File file=new File("demo.txt");
	
	if(file.delete()) {
		System.out.println("deleted :"+file.getName());
	}
	else {
		System.out.println("File does not exist");
	}
}
}
