package com.CollectionFrameWorkExercise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class QuesrtionSix {
	public static void main(String[] args) {
		
	    Set s = new HashSet();   // random print
		
		s.add(3);
		s.add(6);
		s.add(9);
		s.add(12);
		s.add(15);
		s.add(18);
		s.add(21);
		s.add(24);
		s.add(27);
		s.add(30);
			
		
        Set s1 = new TreeSet(); //  it prints in assending order.
		
		s1.add(3);
		s1.add(6);
		s1.add(9);
		s1.add(12);
		s1.add(15);
		s1.add(18);
		s1.add(21);
		s1.add(24);
		s1.add(27);
		s1.add(30);
		

		Set s2 = new LinkedHashSet(); // it prints as it is.
		
		s2.add(3);
		s2.add(6);
		s2.add(9);
		s2.add(12);
		s2.add(15);
		s2.add(18);
		s2.add(21);
		s2.add(24);
		s2.add(27);
		s2.add(30);
		
		ArrayList ar = new ArrayList();
		ar.add(s);
		ar.add(s1);
		ar.add(s2);
		
		Iterator it= ar.iterator();
		for (Object o : ar) {
			
			System.out.println(o);
			
		}
		
	}
}