package com.inputoutputExercises;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class QuestionFour {
	public static void main(String[] args) throws IOException {

		String target = "D:/new.txt";

		FileWriter writer = new FileWriter(target);
		PrintWriter printWriter = new PrintWriter(writer);

		InputStreamReader isReader = new InputStreamReader(System.in);

		BufferedReader in = new BufferedReader(isReader);

		System.out.println("input from here....");

		String line = in.readLine();

		while (!line.equals("quit")) {

			printWriter.println(line);

			line = in.readLine();

		}
		printWriter.close();
		isReader.close();

	}

}
