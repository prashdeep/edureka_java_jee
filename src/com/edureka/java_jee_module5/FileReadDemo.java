package com.edureka.java_jee_module5;


import java.io.*;
import java.util.Scanner;


public class FileReadDemo 
{
	public static void main(String[] args) throws IOException 
	{
		 try {
	         BufferedReader in = new BufferedReader
	         (new FileReader("c:\\data_files\\file.txt"));
	         String str;
	         while ((str = in.readLine()) != null) {
	            System.out.println(str);
	         }
	         
	         }
	         catch (IOException e) {
	         }
	      }
	}