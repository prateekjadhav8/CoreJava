package com.inputoutput;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class WritePrimitiveData {
	
	public static void main(String[] args) throws Exception {
		
		FileOutputStream file = new
				
		FileOutputStream("D:/primitivedata.dat");
		
		DataOutputStream out = new DataOutputStream(file);

		out.writeInt(123456789);

		out.writeBoolean(true);

		out.writeChar('A');

		out.writeDouble(1.2);

		out.close();

		file.close();

		System.out.println("Primitive Data successfully written");
		
	}

}
