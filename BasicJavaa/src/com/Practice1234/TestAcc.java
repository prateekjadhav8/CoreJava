package com.Practice1234;

public class TestAcc {
		 
	    public static void main(String args[]) {
	        Acc acct = new Acc();
	        System.out.println("Current balance : " + acct.balance());
	        System.out.println("Withdrawing 200");
	        acct.withdraw(200);
	        System.out.println("Current balance : " + acct.balance());
	        acct.withdraw(3500);
	 
	    }
	 
	}
