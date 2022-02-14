package com.inputoutputExercises;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestQuestionSevenSecretMessageTwo {
	public static void main(String[] args) throws Exception {
	
		FileInputStream file = new FileInputStream("D:/secret message.ser");
		
		ObjectInputStream in = new ObjectInputStream(file);
		
		QuestionSevenSecretMessage s = (QuestionSevenSecretMessage) in.readObject();
		
		in.close();
		
		System.out.println(s.getMessage());
		
		
	
	}

}
