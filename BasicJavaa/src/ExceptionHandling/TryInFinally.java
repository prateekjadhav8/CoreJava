package ExceptionHandling;

public class TryInFinally {
	public static void main(String[] args) {
		
		try {
		}
		finally {
			
		}
		try {
			String s="wawa";
			
			System.out.println(s.length());
			System.out.println(s.charAt(6));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
