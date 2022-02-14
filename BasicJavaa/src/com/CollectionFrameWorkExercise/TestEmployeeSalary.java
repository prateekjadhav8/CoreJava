package com.CollectionFrameWorkExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class TestEmployeeSalary{
	public static void main(String[] args) {
		
		EmployeeSalaryQ2 e1 = new EmployeeSalaryQ2();

		e1.setSalary(500000);
		e1.setFname("Sagar");
		e1.setLname("Badodiya");

		EmployeeSalaryQ2 e2 = new EmployeeSalaryQ2();

		e2.setSalary(30000);
		e2.setFname("Vaishali");
		e2.setLname("Sawasia");

		EmployeeSalaryQ2 e3 = new EmployeeSalaryQ2();

		e3.setSalary(900000);
		e3.setFname("Prateek");
		e3.setLname("Jadhav");

		ArrayList a = new ArrayList();

		a.add(e1);
		a.add(e2);
		a.add(e3);

		Collections.sort(a,new TestEmployeeSalaryQ2());

		Iterator it =  a.iterator();

		while (it.hasNext()) {
			EmployeeSalaryQ2 o = (EmployeeSalaryQ2) it.next();
			
			System.out.println(o.getSalary()+" "+o.getFname()+" "+o.getLname());
		}
	}
}
	
