package com.exercisefour.point.one.four;

public class TableFromTwoToTen {
	public static void main(String[] args) {
		
		int[][] a=new int[9] [10];

		for (int i=0 ; i<a.length ; i++)

		{
			System.out.println(" ");

		for (int j=2 ; j<=a[i].length ; j++)

		{

		int c=(i+1)* j;

		System.out.print(c+"\t");
		}
		}
	}
}
		