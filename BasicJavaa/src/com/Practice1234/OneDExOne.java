package com.Practice1234;

public class OneDExOne {
	public static void main(String[] args) {
		char[] ch= {'a','b','c','d','e','f','g','h','i','j', 'k'};
		char[] cp= new char[6];
		System.arraycopy( ch ,   4  ,  cp ,   0    ,   6);
	//System.arraycopy(  src, srcPos, dest, destPos, length);
		
		for(char c:cp) {

			System.out.println(c);
		}
	}

}
