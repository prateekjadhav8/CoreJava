package com.inputoutput;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class CopyATextFile {
	
	public static void main(String[] args) throws IOException {
		
		String source = "D:/name.txt";
		String target = "D:/neww.txt";
		
		FileReader r = new FileReader(source);
		FileWriter fw = new FileWriter(target);
		
		int ch = r.read();
		
		while (ch!= -1) {
			
			fw.write(ch);
			ch= r.read();
			
		}
		
		
		System.out.println(source + " Is copied to " + target);
		fw.close();
		r.close();
		
		
	}

}
