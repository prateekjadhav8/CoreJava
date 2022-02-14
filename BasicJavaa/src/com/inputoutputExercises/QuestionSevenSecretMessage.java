package com.inputoutputExercises;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class QuestionSevenSecretMessage implements Externalizable {

	 transient String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(message);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		message = (String) in.readObject();

	}

	

}
