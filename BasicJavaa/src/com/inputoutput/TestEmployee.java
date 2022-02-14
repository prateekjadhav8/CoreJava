package com.inputoutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestEmployee {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream("D:/object.ser");
		
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		Employee e = new Employee();
		
		e.setId(1234567);
		e.setUname("prateek8@");
		e.setPassword(12345);
		
		out.writeObject(e);
		out.close();
        System.out.println("File is created");
		
	}

}
