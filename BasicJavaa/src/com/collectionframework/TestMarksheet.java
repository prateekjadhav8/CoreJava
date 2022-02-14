package com.collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestMarksheet {
	public static void main(String[] args) {
		
		Marksheet m1 = new Marksheet();
		
		m1.setRollNo("3");
		m1.setFname("Prateek");
		m1.setLname("Jadhav");
		m1.setPhy("78");
		m1.setChem("89");
		m1.setMath("77");
		
        Marksheet m2 = new Marksheet();
		
		m2.setRollNo("2");
		m2.setFname("Sagar");
		m2.setLname("Badodia");
		m2.setPhy("56");
		m2.setChem("76");
		m2.setMath("23");
		
        Marksheet m3 = new Marksheet();
		
		m3.setRollNo("4");
		m3.setFname("Vaishali");
		m3.setLname("Sawasia");
		m3.setPhy("54");
		m3.setChem("87");
		m3.setMath("34");
		
        Marksheet m4 = new Marksheet();
		
		m4.setRollNo("1");
		m4.setFname("Rajat");
		m4.setLname("Shrivastava");
		m4.setPhy("70");
		m4.setChem("80");
		m4.setMath("90");
		
		ArrayList List = new ArrayList<>();
		
		List.add(m1);
		List.add(m2);
		List.add(m3);
		List.add(m4);
		
		Collections.sort(List,new TestComparator());
		
		Iterator it =  List.iterator();
		
		while (it.hasNext()) {
			Marksheet m = (Marksheet) it.next();
			System.out.println(m.getRollNo()+" "+ m.getFname()+" "+ m.getLname()+" "+ m.getPhy()+" "+ m.getChem()+" "+ m.getMath());
					
		}
		
	}

}
