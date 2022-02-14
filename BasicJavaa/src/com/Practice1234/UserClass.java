package com.Practice1234;

public class UserClass {
public static void main(String[] args) {
	

	LoginException e = new LoginException();

	
		try {
			throw e;
		} catch (LoginException e1) {
			
			System.out.println(e.getMessage());
	
		
	}
}
}

