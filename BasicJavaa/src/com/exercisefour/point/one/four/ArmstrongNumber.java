package com.exercisefour.point.one.four;

public class ArmstrongNumber {
	public static void main(String[] args) {
		
		int n=189;
		int temp=n;
		int r;
		int sum=0;
		
		while(n>0)
		{
			r=n%10;
			n=n/10;
			
			sum=sum+r*r*r;
			
		}
		if( temp==sum) {
			
			System.out.println(temp+ " is an armstromg number.");
		}
		else {
			
			System.out.println(temp+" is not an armstong number.");
		}
	
	}

}
