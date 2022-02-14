package com.threads;

public class HelloThreadOne extends Thread{
	
		private String name;
		
		public HelloThreadOne (String n) {
		
		  name = n;
		}
		
		  public void run() {
			  
			  for (int i = 0; i <5; i++) {
				  
				  System.out.println(i +"-"+ name);	
			}
		  }
		  
		  public static void main(String[] args) {
			  
			  HelloThreadOne t1 = new HelloThreadOne("Prateek");
			  HelloThreadOne t2 = new HelloThreadOne("vaishali");
			  
			  t1.start();
			  t2.start();
			  
		}

	}
