package com.Practice1234;

public class Account {
	
	private int number;
	private String user;
	private String accounttype;
	private float balance;
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	// methods are applied from here.
	
	public float deposit(float amount) {
		balance = balance+amount;
		return balance;	
	}
     
	public float withdraw(float amount) {
		balance = getBalance()-amount;
		return balance;
	}
	
	public float fundtransfer(float amount) {
		balance = balance-amount;
		return balance;
	}
	
	public float paybill(float amount) {
		balance = balance-amount;
		return balance; 
	}
	public int getAmount() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	}
