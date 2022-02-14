package com.inputoutput;

import java.io.File;

public class DisplayOnlyFilesTwo {
	public static void main(String[] args) {
		File directory = new File ("D:/");
		File[] list =directory.listFiles();
		for (int i = 0; i < list.length; i++) {
			if(list[i].isFile());
			System.out.println((i+1) + list[i].getName());
			
			
		}
		
	}

}
