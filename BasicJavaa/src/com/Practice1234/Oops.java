package com.Practice1234;

class Pen{
	String color;
	String type;                            //Without Constructors 
	
	public void write() {                       // method..
		System.out.println("Write Something");
	}
	
	public void printColor() {
		System.out.println(this.color);
	}
}

class Student{
	String name;
	int age;
	
	public void printInfo() {
	
	System.out.println(this.name);
	System.out.println(this.age);
	
	
		
	
	}
}
public class Oops {

	public static void main(String[] args) {
		
		Pen pen1 = new Pen();
		pen1.color = "blue";
		pen1.type = "gel";
		
		
		Pen pen2 = new Pen();
		pen2.color = "black";
		pen2.type = "ball point";
				
		pen1.printColor();
		pen2.printColor();
		
		
		//   Other class 
		
		
		Student s1 = new Student();
		s1.name = "pratreek";
		s1.age = 25;
		
		s1.printInfo();
		
		
		
	}
}
