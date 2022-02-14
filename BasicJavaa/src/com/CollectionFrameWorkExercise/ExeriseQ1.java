package com.CollectionFrameWorkExercise;

import java.util.ArrayList;
import java.util.Iterator;

public class ExeriseQ1 {
	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		
		l.add("prateek");
		l.add(34);
		l.add(23.3);
		l.add("sagar");
		
		Iterator it=l.iterator();
		
		while (it.hasNext()) {
			Object o = (Object) it.next();
			
			System.out.println(o);
		}
	}
}
