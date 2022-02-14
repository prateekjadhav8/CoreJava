package com.exercisefour.point.one.four;

public class Harmonic {
	public static void main(String[] args) {
		 int h=5;
		 int a=1;
		 int b=1;
      double result;
      
      for(int i=0; i<=h; i++) {
    	  
    	  result=((double)1/(a*i+b)); //Harmonic series is 1/2, 1/3, 1/4
    	
     System.out.println(result);
    }
	}
}
