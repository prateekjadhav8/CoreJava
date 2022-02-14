package com.Practice1234;

public class Circle extends Shape {
	
	private double radius;
	
	public double getRadius() {
		return radius;
		
	}
	
	public void setRadius(double radius) {
		
		this.radius= radius;
		
	}
	public double area() {
		double area = 3.14*radius*radius;
		return area;
	}
}