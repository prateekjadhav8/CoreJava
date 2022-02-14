package com.CollectionFrameWorkExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestEmployeeName {
	public static void main(String[] args) {
		
		EmployeeName e1 = new EmployeeName();
		
		e1.setFname("Sagar");
		e1.setLname("Sharma");
		
		EmployeeName e2 = new EmployeeName();
		
		e2.setFname("Prateek");
		e2.setLname("Jadhav");
		
		EmployeeName e3 = new EmployeeName();
		
		e3.setFname("Vaishali");
		e3.setLname("Sawasia");
		
		
		ArrayList ar = new ArrayList<String>();
		
		ar.add(e1);
		ar.add(e2);
		ar.add(e3);
		
		Collections.sort(ar,new TestEmployeeNameComparator());
		
		
		Iterator it =  ar.iterator();
		
		while (it.hasNext()) {
			
			EmployeeName e = (EmployeeName) it.next();
			
			System.out.println(e.getLname()+" "+e.getFname());
			
		}
	}
} 
