package com.collectionframework;

import java.util.Comparator;

public class TestComparator implements Comparator<Marksheet>{

	@Override
	public int compare(Marksheet o1, Marksheet o2) {
		
		return o1.getFname().compareTo(o2.getFname());
	}

}
