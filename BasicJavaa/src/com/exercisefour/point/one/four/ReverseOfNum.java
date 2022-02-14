package com.exercisefour.point.one.four;

public class ReverseOfNum {
	public static void main(String[] args) {
		
		int a = 1234;
		int b = 0;

	while(a!= 0) {
			
		int c = a % 10;// remainder nikala yaha, c= 4  ,3,  2, 1
		
		b = b*10 + c;  // b=4  , 43  , 432 , 4321
		
		a= a/10;
	}
	
	System.out.println(b);
		
		
	}
}

