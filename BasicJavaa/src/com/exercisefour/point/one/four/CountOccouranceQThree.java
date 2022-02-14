package com.exercisefour.point.one.four;

public class CountOccouranceQThree {
	public static void main(String[] args) {
		
		String s = "vijay Chauhan";
		
		
		char c= 'a';
		int count = 0;
		int i;
		for ( i = 0; i < s.length(); i++) {
			if (c== s.charAt(i)) {
				count ++;
				
			}
			
		}
		System.out.println(count);
		
	}

}
