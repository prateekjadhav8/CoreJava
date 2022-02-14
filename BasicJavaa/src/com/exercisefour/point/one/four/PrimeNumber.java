package com.exercisefour.point.one.four;

public class PrimeNumber {
	public static void main(String[] args) {
		
		int a = 17;
		
		for( int i=2 ; i<a ;) {
			
			if( a % i ==0) {
				
				System.out.println(a+" is not a prime number.");
		
			}else
				
				System.out.println(a+" is a prime number.");
				break;
		}
	}
}