package com.inputoutputExercises;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestStudentQuestionFiveTwo {
	public static void main(String[] args) throws Exception {

		FileInputStream file = new FileInputStream("D:/jamun.ser");

		ObjectInputStream in = new ObjectInputStream(file);

		StudentQuestionFive s = (StudentQuestionFive) in.readObject();

		in.close();

		System.out.println(s.getName());
		System.out.println(s.getAge());

	}

}
