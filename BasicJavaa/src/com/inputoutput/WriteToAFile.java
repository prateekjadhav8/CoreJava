package com.inputoutput;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteToAFile {
	public static void main(String[] args) throws IOException {
		FileWriter writer = new FileWriter("D:/neww.txt",true);  //  appending is done here,
		PrintWriter pw = new PrintWriter(writer);
		
		for (int i = 0; i <5; i++) {
			
			pw.println(i+": prateek");

		
		}
		
		writer.close();
		pw.close();
		
		System.out.println("File is succesfully written, please check D:/neww.txt");
		
		
	}

}
