package com.inputoutput;

import java.io.File;

public class DisplayFileAndDirectories {
	public static void main(String[] args) {
		
		File Directory = new File("D:/");
		
		String[] list = Directory.list();
		for (String o : list) {
			System.out.println(o);
			
		}
	}

}
