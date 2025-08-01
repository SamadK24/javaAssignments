package com.swabhav.StudentSortingSystem.model;

import java.util.Comparator;

public class NameAscComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.name.compareToIgnoreCase(o2.name);
	}
	

}
