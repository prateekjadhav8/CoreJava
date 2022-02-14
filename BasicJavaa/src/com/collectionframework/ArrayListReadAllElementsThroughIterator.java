package com.collectionframework;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListReadAllElementsThroughIterator {
	public static void main(String[] args) {
		
		ArrayList v = new ArrayList();
		
		v.add("Jay");
		
		Iterator i = v.iterator();
		
		
		for (Object object : v) {
			System.out.println(object);
		}
		
		/*while(i.hasNext()) {
			
			Object o = i.next();
			
			System.out.println(o);*/
		
		}
	}

