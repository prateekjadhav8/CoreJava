package com.CollectionFrameWorkExercise;

import java.util.Comparator;

public class TestEmployeeNameComparator implements Comparator<EmployeeName>{

	@Override
	public int compare(EmployeeName e1, EmployeeName e2) {
		if(!(e2.getLname().equals(e1.getLname()))) {

		
		return e1.getLname().compareTo(e2.getLname());
	
}
	else {
		
		return e2.getFname().compareTo(e1.getFname());
	}


	}
}
