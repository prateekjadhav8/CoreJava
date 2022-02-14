package com.Practice1234;

public class StringMethods {
	
	public static void main(String[] args) {
		
			String s="prateek jadhav 8@gmail. com";

			System.out.println("string length is: "+s.length());
			
			System.out.println("7th character is: "+s.charAt(5));
			
			System.out.println("ja index is: " +s.indexOf("ja"));
			
			System.out.println("First k position: "+s.indexOf("k"));
			
			System.out.println("last j position: "+s.lastIndexOf("j"));
			
			System.out.println("p is replaced by o: "+s.replace("p" , "o"));
			
			System.out.println("All a is replaced by k: "+s.replaceAll("a" , "k"));
			
			System.out.println("Prateek in Lower case : "+s.toLowerCase());
			
			System.out.println("Pateek in Upper case : " +s.toUpperCase());
			
			System.out.println("Starts with jadhav: " +s.startsWith("Jadhav"));
			
			System.out.println("Starts with prateek: " +s.startsWith("prateek"));
			
			System.out.println("Ends with com: " +s.endsWith("com"));
			
			System.out.println("Substring: " +s.substring(7));
	}
}
