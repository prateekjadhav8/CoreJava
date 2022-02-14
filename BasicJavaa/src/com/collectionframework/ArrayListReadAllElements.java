package com.collectionframework;
import java.util.ArrayList;

public class ArrayListReadAllElements {
	public static void main(String[] args) {
		
		ArrayList v = new ArrayList();
		
		v.add("one");
		v.add("two");
		v.add("three");
		v.add("four");
		
		
		int size = v.size();
		for (int j = 0; j < size ; j++) {
			System.out.println(j + " : " +v.get(j));
		}
	}
}
