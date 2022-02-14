package com.Java.oop;

public class TestClass {
	public static void main(String[] args) {
		
		Person p= new Person();
	 p.setId(1);
	 p.setName("Prateek");
	 p.setAddress("Indore");
	 System.out.println("Id is "+p.getId());			
	 System.out.println("Address is "+p.getAddress());
	 System.out.println("Name is "+p.getName());
	}

}
											