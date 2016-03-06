package com.edureka.java_jee.module_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionDemo {

	public void accessingFile(String path) throws MyBuinessException {
		// some file operioin or connecting to some other sytem.

		// connect the other system to get the information
		FileReader file;
		try {
			file = new FileReader(path);
			file.read();
			file.close();
		} catch (Exception exception) {
			throw new MyBuinessException("The server is down. Please tr after some time.");
		}

	}

	public static void main(String args[]) throws MyBuinessException   {
		CheckedExceptionDemo obj = new CheckedExceptionDemo();
		
			System.out.println("Came inside the main method..");
			obj.accessingFile("dfsdfsd");
			
		
	}

}
