package com.Java.oop;

public class PolymorphismArray {
	public static void main(String[] args) {
		
		ShapeOne s[]= new ShapeOne[3];
		s[0]= new Rectangle1(5,6);
		s[1]= new Triangle1(5,6);
		s[2]= new Circle1(5);
		
		double totalArea = calcArea(s);
		System.out.println(totalArea);
	}
	
	public static double calcArea(ShapeOne s[]) {
		double totalArea =0;
		
		for (int i=0 ; i<s.length ; i++) {
			totalArea += s[i].area();
			
		}
		return totalArea;
	}

}
