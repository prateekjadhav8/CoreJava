package com.inputoutputExercises;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class StudentQuestionFive implements Externalizable{
	
	 String name;
	 transient int age;
	 
	 public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		
		out.writeObject(name);
		out.writeInt(age);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		
	name = (String) in.readObject();
	age = in.readInt();
	
		
	}
}
	