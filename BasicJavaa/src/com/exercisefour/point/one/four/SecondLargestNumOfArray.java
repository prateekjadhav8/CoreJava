package com.exercisefour.point.one.four;

public class SecondLargestNumOfArray {
	public static void main(String[] args) {
		
		                    // 0  1   2   3   4   5
		int[] a = new int[] { 10, 20, 50, 40, 64, 100};
		
		int temp;
	
	for( int i=0 ; i<a.length ; i++)
	{                                     // sorting the array in decending order.
		for( int j= i+1 ; j<a.length ; j++)
		{
			if (a[i] < a[j])// if true than it will swap the value.
			{
				temp= a[i];
				a[i]= a[j]; // swapping is done here.
				a[j]= temp;
				
			}
		}
		
	}
	System.out.println(a[1]);
	}
}
