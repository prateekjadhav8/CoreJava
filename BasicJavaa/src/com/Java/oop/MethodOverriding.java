package com.Java.oop;

public class MethodOverriding {

	public static void main(String[] args) {
		
		ShapeOne s = new Circle1(5);
		double d= s.area();
		System.out.println(d);
		
		ShapeOne n= new Rectangle1(5,6);
		double f= n.area();
		System.out.println(f);
		
		ShapeOne u=new Triangle1(5,6);
		double b= n.area();
		System.out.println(b);
		
		
		
	}

}
