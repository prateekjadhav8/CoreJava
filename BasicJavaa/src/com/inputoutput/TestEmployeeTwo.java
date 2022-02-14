package com.inputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class TestEmployeeTwo {
	public static void main(String[] args) throws Exception {
		FileInputStream file = new FileInputStream("D:/object.ser");
		ObjectInputStream in = new ObjectInputStream(file);
		
		Employee e = (Employee) in.readObject();
		
		System.out.println("Your id is - " +e.getId());
		
		System.out.println("Your UserName is - " +e.getUname());
		
		System.out.println("Your password is - " +e.getPassword());
		
		
	}

}
 