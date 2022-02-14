package com.Practice1234;

public class TestAccount {
	public static void main(String[] args) {
		
		Account a = new Account();
		
		a.setAccounttype("Savings");
		a.setUser("prateek");
		a.setNumber(23445);
		a.setBalance(10000);
		a.deposit(1000);
	    a.withdraw(500);
		a.fundtransfer(3000);
		a.paybill(500);
		
		System.out.println("Account user name-  "+a.getUser());
		System.out.println("Account number-   "+a.getNumber());
		System.out.println("Account type-   "+a.getAccounttype());
		System.out.println("Current balance-   "+a.getBalance());
		
		
	} 

	
}
