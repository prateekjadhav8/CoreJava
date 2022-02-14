package com.Java.oop;

public class Businessman implements Richman, SocialWorker{

	@Override
	public void helpToOthers() {
		System.out.println("Do help");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void earnMoney() {
		System.out.println("Work hard and earn money");
		// TODO Auto-generated method stub
		
	}

	@Override
	public double donation() {
		System.out.println("I donate");
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void party() {
		System.out.println("Hurray party");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		
		Richman rm= new Businessman();

		SocialWorker sw = new Businessman();
		
		Businessman bm = new Businessman();
		bm.donation();
		bm.party();
		bm.earnMoney();
		bm.helpToOthers();
	}
}