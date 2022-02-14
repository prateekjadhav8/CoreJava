package com.inputoutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestMarksheetBean {
	public static void main(String[] args) throws IOException {
		
      FileOutputStream file = new FileOutputStream("D:/objectOne.ser");
		
	  ObjectOutputStream out = new ObjectOutputStream(file);
	  
	  MarksheetBean e = new MarksheetBean();
	  
	  e.setName("Prateek");
	  out.writeObject(e);
		
	}

	public char[] getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
