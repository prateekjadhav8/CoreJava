package com.inputoutputExercises;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestStudentQuestionFive {
	public static void main(String[] args) throws IOException {

		FileOutputStream file = new FileOutputStream("D:/jamun.ser");

		ObjectOutputStream out = new ObjectOutputStream(file);

		StudentQuestionFive s = new StudentQuestionFive();

		s.setName("Prateek");
		s.setAge(25);

		out.writeObject(s);
		out.close();
		System.out.println("done");

	}

}
