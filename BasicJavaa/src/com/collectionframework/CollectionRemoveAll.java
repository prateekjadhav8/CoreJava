package com.collectionframework;
import java.util.ArrayList;
import java.util.List;

class CollectionRemoveAll {
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
		 
		 System.out.println(m.removeAll(m));
		 System.out.println(m);
	}

}
