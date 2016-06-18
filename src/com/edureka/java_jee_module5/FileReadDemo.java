package com.edureka.java_jee_module5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader("c:\\data_files\\file.txt"));
			String str;
			while ((str = in.readLine()) != null) {
				System.out.println(str);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			in.close();
		}
	}
}