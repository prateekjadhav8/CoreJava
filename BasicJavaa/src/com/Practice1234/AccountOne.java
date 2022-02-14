package com.Practice1234;

public class AccountOne {
	
	public float getBalance() {
		return balance;
	}


	public void setBalance(float balance) {
		this.balance = balance;
	}


	private float balance = 10000;

	
	public void withdraw (float amount) {
		if (amount <=balance)
		balance = balance -= amount;
		
		else {
			System.err.println("You have insufficient balance  "+balance);
			
		}
	}
	
	
	}
		