package com.inputoutput;

import java.io.File;
import java.util.Date;

public class AllMethods {
	public static void main(String[] args) {
		
		File f = new File("D:/", "name.txt");
		
		System.out.println(f.getName());
		System.out.println(f.getAbsoluteFile());
		System.out.println(f.canWrite());
		System.out.println(f.canRead());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		System.out.println(new Date(f.lastModified()));
		System.out.println(f.length());
	}

}
