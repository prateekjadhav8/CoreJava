package com.threads;

public class HelloThreadTwo implements Runnable{

		
		private String name;
		
		public HelloThreadTwo (String n) {
		
		  name = n;
		}
		
		  public void run() {
			  
			  for (int i = 0; i <50; i++) {
      /*				  try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}*/
				  
				  System.out.println(i +"-"+ name);	
			}
		  }
		  
		  public static void main(String[] args) {
			  
			  HelloThreadTwo t1 = new HelloThreadTwo("Prateek");
			  HelloThreadTwo t2 = new HelloThreadTwo("vaishali");
			  
			  Thread tt = new Thread (t1);
			  Thread th = new Thread(t2);
			  
			  tt.setPriority(10);
			  th.setPriority(1);
			  
			  tt.start();
			  th.start();
			  
		}


}
