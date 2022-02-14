package com.collectionframework;
import java.util.Stack;

public class CollectionStack {
	public static void main(String[] args) {
		
		Stack s = new Stack<>();
		
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);          // fifo
		
		//s.pop();
		System.out.println(s.peek());
		System.out.println(s);
		
	}

}
