package com.collectionframework;

import java.util.ArrayList;
import java.util.List;

public class TestCollection {
	public static void main(String[] args) {
	 List l = new ArrayList();
	 l.add(12);
	 l.add(13.7);
	 l.add("p");
	 l.add("Java");
	 
	 
	 List m = new ArrayList();
	 m.add(14);
	 m.add(24.4);
	 m.add("j");
	 m.add("Prateek");
	 
	 System.out.println(l);
	 System.out.println(m);
	 for(Object o : l) {
		 System.out.println(o);
	 }
	 
	}

}
