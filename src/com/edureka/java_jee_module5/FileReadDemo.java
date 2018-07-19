package com.edureka.java_jee_module5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {
	public static void main(String[] args) {
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader("c:\\data_files\\file.txt"));
			String str;
			while ((str = in.readLine()) != null) {
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			System.out.println("SOurce file not present to read..");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Came inside the catch block..");
				e.printStackTrace();
			}
		}
	}
}