package com.inputoutput;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadPrimitiveData {
	public static void main(String[] args) throws IOException {
		
		      FileInputStream file = new

				FileInputStream("D:/primitivedata.dat");

				DataInputStream in = new DataInputStream(file);

				System.out.println(in.readInt());

				System.out.println(in.readBoolean()); 
				
				System.out.println(in.readChar());

				System.out.println(in.readDouble());

			    in.close();
			    in.close();
		
		
	}

}
