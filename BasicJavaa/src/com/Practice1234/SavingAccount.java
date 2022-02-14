package com.Practice1234;

public class SavingAccount extends Account{
	public int getAmount() {
		int i = super.getAmount()+10;
		return i;
		
	}
	public static void main(String[] args) {
		SavingAccount s= new SavingAccount();
		Account sa= new SavingAccount();
		Account a = new Account();
		
		System.out.println(s.getAmount());
		System.out.println(sa.getAmount());
		System.out.println(a.getAmount());
	}
	

}
