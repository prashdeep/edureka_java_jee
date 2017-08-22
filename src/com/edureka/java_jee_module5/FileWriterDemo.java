package com.edureka.java_jee_module5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class FileWriterDemo {

	public static void main(String args[]) throws IOException {

		File file = new File("c:\\data_files\\myProject.properties");
		// creates the file
		file.createNewFile();
		BufferedReader in = null;
		// creates a FileWriter Object
		FileWriter writer = new FileWriter(file);
		// Writes the content to the file
		try {
			in = new BufferedReader(new FileReader("c:\\data_files\\file.txt"));
			String str;
			while ((str = in.readLine()) != null) {
				writer.write(str + "\n");
				System.out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			writer.flush();
			writer.close();
			in.close();
		}
	}
}
