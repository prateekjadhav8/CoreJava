package ExceptionHandling;

public class TextException {

	public static void main(String[] args) {
		try {
			double div = 15 / 0; // this is an exception

			System.out.println(div);

		} catch (ArithmeticException e) {
			System.out.println("Code is empty"); // exception handelled
		}
	}
}
