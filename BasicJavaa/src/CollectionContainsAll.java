import java.util.ArrayList;
import java.util.List;

public class CollectionContainsAll {
	public static void main(String[] args) {
		 List m = new ArrayList();
		 m.add(14);
		 m.add(24.4);
		 m.add("j");
		 m.add("Prateek");
		 
		 System.out.println(m.containsAll(m));
	}

}
