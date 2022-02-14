package com.Java.oop;

public class BusinessmanOne extends Person implements Richman , SocialWorker{

	@Override
	public void helpToOthers() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void earnMoney() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double donation() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void party() {
		// TODO Auto-generated method stub
		
	}
	private String name;
	private String address;
	
	public static void main(String[] args) {
		Person p = new BusinessmanOne();
		
		p.setName("Prateek");
		p.setAddress("Indore");
		System.out.println(p.getAddress());
		System.out.println(p.getName());
		
	}
		
	}

