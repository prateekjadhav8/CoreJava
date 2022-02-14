import java.util.ArrayList;
import java.util.List;

public class CollectionRetain {
	public static void main(String[] args) {
		List l = new ArrayList();
		 l.add(12);
		 l.add(13.7);
		 l.add("p");
		 l.add("java");
		 
		 
		 List m = new ArrayList();
		 m.add(14);
		 m.add(24.4);
		 m.add("p");
		 m.add("java");
		 
		 
		 
		 l.retainAll(m);   /// similar elements will be printed
		 
		 System.out.println(l);
		 System.out.println(m);
		 
	}

}
