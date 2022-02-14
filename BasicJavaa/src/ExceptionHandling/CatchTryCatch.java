package ExceptionHandling;

public class CatchTryCatch {
	public static void main(String[] args) {
		
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			String s="Prateek";
			System.out.println(s.replaceAll(s,s));
		}
		catch(Exception n) {
			System.out.println(n.getMessage());
		}
	}
	

}
