package com.Practice1234;

public class TestAccountOne {
	private static int balance;

	public static void main(String[] args) {
		
		AccountOne a = new AccountOne();
		
		a.setBalance(10000);
		a.withdraw(500);
		
		System.out.println(a.getBalance());

}
}
