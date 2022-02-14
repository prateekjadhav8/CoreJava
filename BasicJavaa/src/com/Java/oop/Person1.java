package com.Java.oop;

public class Person1 {
	
	protected String firstName;
	protected String lastName;
	protected String address;
	
	public Person1() {

	}
	public Person1(String fn, String ln) {
		firstName = fn;
		lastName = ln;
		
		System.out.println(fn + ln);
		
	}
    public Person1 (String fn , String ln , String add) {
    	firstName = fn;
    	lastName = ln;
		address = add;
		System.out.print(firstName);
		System.out.print(lastName);
		System.out.print(add);
		
	}
public static void main(String[] args) {
	
	Person1 p = new Person1("Prateek ", "Jadhav ",",Indore");
}
public void address() {
	// TODO Auto-generated method stub
	
}
}