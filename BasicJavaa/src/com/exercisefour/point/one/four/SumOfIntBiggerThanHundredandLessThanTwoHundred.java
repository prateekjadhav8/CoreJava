package com.exercisefour.point.one.four;

public class SumOfIntBiggerThanHundredandLessThanTwoHundred {
	
	public static void main(String[] args) {
		
		int a=0;
		
		for (int i=100 ; i<200 ; i++) {
			
			if( i % 7==0 )
				
				a= a+i;  //a+=i = addition assignment operator.
			
		}
		System.out.println(a);
	}

}
