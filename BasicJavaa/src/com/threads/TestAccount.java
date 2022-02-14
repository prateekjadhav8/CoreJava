package com.threads;

public class TestAccount extends Thread {

	public static Account a = new Account();

	String name = null;

	public TestAccount(String name) {
		this.name = name;

	}

	public void run() {

		for (int i = 0; i < 5; i++) {

			a.deposit(name, 1000);

		}
	}

	public static void main(String[] args) {

		TestAccount t1 = new TestAccount("Prateek");
		TestAccount t2 = new TestAccount("Ram");

		t1.start();
		t2.start();

	}

}
