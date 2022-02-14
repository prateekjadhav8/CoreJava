package com.Java.oop;

public class Triangle1 extends ShapeOne {
	
	private int height;
	private int base;
	
	public Triangle1() {}
	public Triangle1(int h, int b) {
		height = h;
		base = b;
		
	}
	
	public double area() {
		
		area = height*base/2;
		return area;
	}
}


