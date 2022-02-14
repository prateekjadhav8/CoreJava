package com.inputoutput;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Assignment {
	public static void main(String[] args) throws IOException {

		String source = "D:/name.txt";
		String target = "D:/separatedEmail.txt";

		FileReader r = new FileReader(source);

		Scanner sc = new Scanner(r);

		FileWriter writer = new FileWriter(target);
		PrintWriter pw = new PrintWriter(writer);

		String regex = "[\\w-]{1,100}@\\w{2,100}\\.\\w{2,8}$";

		while (sc.hasNextLine()) {

			String line = sc.nextLine();

			if (line.matches(regex)) {

				pw.println(line);

			}

		}
		System.out.println("The correct emails are succesfully sorted and pasted to the target folder.");
		pw.close();
		writer.close();
		sc.close();
		r.close();

	}

}
