package com.inputoutput;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {
	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("D:/new.txt");
		BufferedReader br= new BufferedReader(reader);
		
		String line = br.readLine();
		while (line!= null) {
			
		line= br.readLine();
		System.out.println(line);
			
			
		}
		reader.close();
		
	}

}
