import java.util.ArrayList;

public class ArrayListImplementsList {
	
	public static void main(String[] args) {
		
		ArrayList v = new ArrayList();
		
		v.add("Prateek");
		v.add("Sagar");
		v.add("Vaishali");
		v.add("rays");
		v.add("Jamun");
		v.add("Kela");
		
 		Integer i = new Integer(7);
 		v.add(i);
 		
 		Integer value = (Integer) v.get(6);
 		
 		System.out.println("Index#3 value =" +value);
 		System.out.println(v);
	}

}
