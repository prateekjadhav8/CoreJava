package com.inputoutput;

import java.io.File;

public class DisplayOnlyFiles {
	public static void main(String[] args) {
		File directory = new File ("D:/");
		 
		 String[] list = directory.list();
		 for (int i = 0; i < list.length; i++) {
			File f = new File("D:/", list[i]);
			if(f.isFile()){
				System.out.println(i+ " : " +list[i]);
			}
			
			
		}
		 
	}

}
