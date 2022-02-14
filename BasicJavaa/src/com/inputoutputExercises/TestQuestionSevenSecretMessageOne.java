package com.inputoutputExercises;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestQuestionSevenSecretMessageOne {
	public static void main(String[] args) throws Exception {
		
		FileOutputStream file = new FileOutputStream("D:/secret message.ser");
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		QuestionSevenSecretMessage s = new QuestionSevenSecretMessage();
		
		s.setMessage("Jane meri jane man bachpan ka pyar mera bhool nhi jana re");
		
		out.writeObject(s);
		out.close();
		System.out.println("done");
		

	}
	
	
}
