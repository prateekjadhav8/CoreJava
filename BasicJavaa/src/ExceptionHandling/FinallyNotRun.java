package ExceptionHandling;

public class FinallyNotRun {
	public static void main(String[] args) {
		
		try {
			String s = "Prateek";
			System.out.println(s.length());
			System.out.println(s.charAt(9));
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		
		finally {
			
			System.out.println("final");
		}
	}

}
