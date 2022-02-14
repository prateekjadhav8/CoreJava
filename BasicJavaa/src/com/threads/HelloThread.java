package com.threads;

public class HelloThread {
	
	private String name;
	
	public HelloThread (String n) {
	
	  name = n;
	}
	
	  public void show() {
		  
		  for (int i = 0; i < 5; i++) {
			  
			  System.out.println(i +"-"+ name);	
		}
	  }
	  
	  public static void main(String[] args) {
		  
		  HelloThread t1 = new HelloThread("Prateek");
		  HelloThread t2 = new HelloThread("vaishali");
		  
		  t1.show();
		  t2.show();
		  
	}

}

