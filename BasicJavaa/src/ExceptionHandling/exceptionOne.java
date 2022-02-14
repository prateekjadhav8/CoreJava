package ExceptionHandling;

public class exceptionOne {
	public static void main(String[] args) {
		try {
		String s = "java";  // NullPointerException
		System.out.println(s.length());
		System.out.println(s.charAt(4));
	}
		catch(NullPointerException e) {
	System.out.println("String incomplete");
	
	}
	}
}
