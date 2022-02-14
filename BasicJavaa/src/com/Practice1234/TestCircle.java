package com.Practice1234;

public class TestCircle {
	public static void main(String[] args) {
		
		Circle c = new Circle();
		c.setRadius(4);
		c.setColor("red");
		
		System.out.println(c.getRadius());

		System.out.println(c.getColor());
		
		System.out.println(c.area());
	}
 
}
