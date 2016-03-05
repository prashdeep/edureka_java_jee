package com.edureka.java_jee_module5;

import java.io.*;

public class FileWriterDemo {

	public static void main(String args[]) throws IOException {

		File file = new File("Hello1.txt");
		// creates the file
		file.createNewFile();
		// creates a FileWriter Object
		FileWriter writer = new FileWriter(file);
		// Writes the content to the file
		writer.write("This is an example");
		writer.flush();
		writer.close();
	}
}
