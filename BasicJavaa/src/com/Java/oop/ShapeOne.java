package com.Java.oop;

public class ShapeOne {
	
	private  String color;
	private int borderWidth; 
	double area;
	
	public ShapeOne() {}   // default Constructor
	
	public ShapeOne(String c,int b) {
		color= c;
		borderWidth =b;
		System.out.println("Color - " +c);
		System.out.println("BorderWidth - " +5);
			
	}
	public double area() {
		return area;
		
	}

}	
