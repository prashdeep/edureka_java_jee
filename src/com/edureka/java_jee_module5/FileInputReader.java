package com.edureka.java_jee_module5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileInputReader {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("F:\\data-files\\data.txt")));
		String returnData = readFile(bufferedReader);
		System.out.println("Before writing the data to the file..");
		System.out.println(returnData);

		FileWriter writer = new FileWriter(new File("F:\\data-files\\backup.txt"));

		writer.write(returnData);

		bufferedReader.close();
		writer.close();

	}

	private static String readFile(BufferedReader reader) throws IOException {
		boolean flag = true;
		StringBuffer sb = new StringBuffer();

		while (flag) {
			String line = reader.readLine();

			if (line == null) {
				flag = false;
				break;
			}
			sb.append(line);

		}
		return sb.toString();
	}

}
