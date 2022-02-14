package com.Java.oop;

public class Circle1 extends ShapeOne {
	
	private int radius;
	public static final double PI=3.14;

	
	public Circle1() {}
	public Circle1(int r) {
		radius = r;
	}
	
	public double area() {
		
		area = 3.14*radius*radius;
		return area;
	}
	

}
