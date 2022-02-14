package com.inputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyABinaryFile {
	public static void main(String[] args) throws Exception {
		
		String source= "D:/prateek.jpg";
		String  target = "D:/vaishali.jpg";
		
		FileInputStream reader = new FileInputStream(source);
		
		FileOutputStream writer =  new FileOutputStream(target);
		
		int  ch = reader.read();
		while (ch!= -1) {
			
			writer.write(ch);
			ch = reader.read();
			
			
		}
		writer.close();
		reader.close();
		
		System.out.println(source + " is copied to " + target);
		
		
	
		
	}

}
