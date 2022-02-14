package com.collectionframework;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInteraceMethods{

	public static void main(String[] args) {
		
		Queue q= new PriorityQueue();
		
		q.add(12);
		q.add(14);           // It all should be of similar data type.
		q.add(13);
		q.add(15);
		q.add(16);
		q.add(17);
		q.add(18);
		q.add(19);
		
		
		//System.out.println(q);
		
		for (Object object : q) {
			System.out.println(object);
			
		}
		
	    //q.remove(); //  head remove kia
        //		q.offer();
//		System.out.println(q);
		
		
	  //  System.out.println(q.poll());
		
 
	}

}
//q.offer(3);  // this will put the value in the very first place of the array l
		//q.poll();  // pehla wala hata dega or baki ko random print de dega.