package com.inputoutput;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestMarksheetBeanTwo {
	public static void main(String[] args) throws Exception {
		
		FileInputStream file = new FileInputStream("D:/objectOne.ser");
		ObjectInputStream in = new ObjectInputStream(file);
		
		
		MarksheetBean e = (MarksheetBean)in.readObject();
		System.out.println("Your name is -" +e.getName());
	}
	

}
