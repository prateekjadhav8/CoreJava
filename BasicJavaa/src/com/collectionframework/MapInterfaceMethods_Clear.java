package com.collectionframework;
import java.util.HashMap;
import java.util.Map;

public class MapInterfaceMethods_Clear {
	public static void main(String[] args) {
		
		Map m = new HashMap();
		
		m.put(1, "Prateek");
		m.put(2, "Sagar");
		m.put(3, "Vaishali");
		m.put(4, "Rays");
		m.put(5, "Yash");
		m.put(6, "Jamun");
		m.put(7, "kela");
		m.put(8, "Ramu");
		 
		
		 // right side me methods hai ,             lest side me sare outputs hai.
		
		
		//m.clear();
		//System.out.println(m);
		
		//System.out.println(m.containsKey(3));  //true
		
		//System.out.println(m.containsValue("Rays"));  // true
		
		//System.out.println(m.entrySet()); //[1=Prateek, 2=Sagar, 3=Vaishali, 4=Rays, 5=Yash, 6=Jamun, 7=kela, 8=Ramu]

		//System.out.println(m.get(6));   //Jamun
		
		//System.out.println(m.isEmpty());  //false
		
		//System.out.println(m.keySet());  //[1, 2, 3, 4, 5, 6, 7, 8]
		
		//m.put(1, "Radha");
		//System.out.println(m); //{1=Radha, 2=Sagar, 3=Vaishali, 4=Rays, 5=Yash, 6=Jamun, 7=kela, 8=Ramu}
		
		//m.remove(4);
		//System.out.println(m);  //{1=Prateek, 2=Sagar, 3=Vaishali, 5=Yash, 6=Jamun, 7=kela, 8=Ramu}
		
		//System.out.println(m.size()); //8
		
		System.out.println(m.values()); // [Prateek, Sagar, Vaishali, Rays, Yash, Jamun, kela, Ramu]

	
	}

}
