package com.exercisefour.point.one.four;

public class MaxOfArray {
	public static void main(String[] args) {
		
		                      //  0   1   2   3   4   5
			int[] a = new int[] { 10, 20, 50, 40, 64, 100};
			
			int Max = a[0]; // asumed that a[0] is the largest.(20)
			
			for(int i=1 ; i<a.length ; i++) //ye 5 bar chalega  1 , 2 , 3 , 4 , 5
				
				{    
				
				if(a[i] > Max )  // if true
					
				{ 
					             // it will replace the value of Max if the larger number is found.
					Max = a[i]; // repalcment will occour here.
				}
			}
			
			System.out.println(Max);
	}
}
