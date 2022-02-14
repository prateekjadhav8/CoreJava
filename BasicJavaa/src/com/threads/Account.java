package com.threads;

public class Account {

	private int balance = 0;

	public synchronized void deposit(String message, int amount) {

		int bal = getBalance() + amount;

		setBalance(getBalance() + amount);

		System.out.println(message + bal);
	}

	public int getBalance() {
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		return balance;
	}

	public void setBalance(int balance) {

		this.balance = balance;

	}

}
