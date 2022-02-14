package com.Java.oop;

public class Employee extends Person1{
	private String designation = null;

	
	public Employee() {
		System.out.println("Default Constructor");
		
	}
	
	public Employee (String fn, String ln, String des) {
		super(fn, ln);// parameterized constuctor of class person1
		designation = des;
		System.out.println("3 parameter constructor is called");
	}

}
