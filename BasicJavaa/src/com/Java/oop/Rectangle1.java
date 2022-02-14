package com.Java.oop;

public class Rectangle1 extends ShapeOne{
	
	private int length;
    private int width;
	
	public Rectangle1() {}
	public Rectangle1(int l, int w) {
		length = l;
		width= w;
	}
		
	public double area() {
		
		area = length*width;
		return area;
	}
		
}
