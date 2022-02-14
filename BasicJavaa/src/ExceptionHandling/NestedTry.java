package ExceptionHandling;

public class NestedTry {
	public static void main(String[] args) {
		
		try {
			try {
				String s = "java";
				
				System.out.println(s.length());
				System.out.println(s.charAt(4));		
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}finally {
	
		}
	}

}