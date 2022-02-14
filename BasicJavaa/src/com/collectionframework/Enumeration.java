package com.collectionframework;

import java.util.Vector;

public class Enumeration {
	
	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add(1);
		v.add("candy");
		v.add("Jamun");
		v.add("banno");
		
		//java.util.Enumeration e = v.elements();
		//while (e.hasMoreElements()) {
			//System.out.println(e.nextElement());
			
			for (Object o : v) {
			System.out.println(o);
				
			}
			
		}
		
	}
