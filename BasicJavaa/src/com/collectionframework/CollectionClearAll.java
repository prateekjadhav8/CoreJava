package com.collectionframework;

import java.util.ArrayList;
import java.util.List;

public class CollectionClearAll {
	public static void main(String[] args) {
		List l = new ArrayList();
		 l.add(12);
		 l.add(13.7);
		 l.add("p");
		 l.add("Java");
		
		l.clear();
		System.out.println(l);
	}

}
