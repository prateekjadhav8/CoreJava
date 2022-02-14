package com.Java.oop;

public class TestAccount {
		public static void main(String[] args) {
			Account a = new Account("Prateek", 100);
			System.out.println(a.getOwner());
			System.out.println(a.deposit(200));
			System.out.println(a.withdraw(100));
			System.out.println(a.getBalance());
		}
}
