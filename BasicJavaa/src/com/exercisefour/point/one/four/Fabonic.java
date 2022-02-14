package com.exercisefour.point.one.four;

public class Fabonic {
	public static void main(String[] args) {
		
		int a=0;                          //011235813
		int b=1;
		int c;
		 
		for(int i=0 ; i<=5 ; i++){
			
			c=a+b; //0+1=1
			a=b;   //a=1
			b=c;   //b=1
		System.out.println(c);
		
		}
	}
}

