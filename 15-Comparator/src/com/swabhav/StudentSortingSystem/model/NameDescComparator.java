package com.swabhav.StudentSortingSystem.model;

import java.util.Comparator;

public class NameDescComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o2.name.compareToIgnoreCase(o1.name);
	}

}
