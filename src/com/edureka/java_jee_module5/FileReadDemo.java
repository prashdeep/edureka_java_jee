package com.edureka.java_jee_module5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {
	public static void main(String[] args) {
		BufferedReader in = null;
		//try {
			in = new BufferedReader(new FileReader("c:\\data_files\\file.txt"));
			String str;
			while ((str = in.readLine()) != null) {
				System.out.println(str);
			}
		//} catch (IOException e) {
		//	e.printStackTrace();
		//} finally {
		//	try {
		//		in.close();
		//	} catch (IOException e) {
				// TODO Auto-generated catch block
			//	e.printStackTrace();
			//}
		//}
	}
}