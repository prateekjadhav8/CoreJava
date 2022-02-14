package com.Java.oop;

public class EmployeeOne extends Person1{
	
	public void changeAddress() {
		System.out.println("Indore");
		super.address();
		System.out.println("Employee change address");
	}
	public static void main(String[] args) {
		EmployeeOne e= new EmployeeOne();
		e.changeAddress();
	}
}
