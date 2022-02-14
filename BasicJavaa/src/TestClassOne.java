
public class TestClassOne {
	public static void main(String[] args) {
		
		Account a = new Account();
		
		a.setNumber(12345678);
		a.setAccountType("savings");
		a.setBalance(50000.00);
		System.out.println(a.getNumber());
		System.out.println(a.getAccountType());
		System.out.println(a.getBalance());
		
	}
}
