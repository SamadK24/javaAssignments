package com.swabhav.Candidates.Model;

import java.util.Comparator;

public class NameAge implements Comparator<Candidates>{

	@Override
	public int compare(Candidates o1, Candidates o2) {
		int nameCompare = o1.name.compareToIgnoreCase(o2.name);
	    if (nameCompare != 0) {
	        return nameCompare;
	    }
	    return Integer.compare(o1.age, o2.age);
	}
}
