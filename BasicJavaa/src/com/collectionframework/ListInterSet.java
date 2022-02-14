package com.collectionframework;
import java.util.ArrayList;
import java.util.List;

public class ListInterSet {

	public static void main(String[] args) {
		List l = new ArrayList();
		 l.add(12);
		 l.add(13.7);
		 l.add("p");
		 l.add("Java");
		 
		 l.set(1, "Java");
		 System.out.println(l);

	}

}
