package com.edureka.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Pradeep");
		employee.setAddress("71E Girinagar Bangalore");
		employee.setNumber(772223);
		employee.setSSN(33444444);

		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("c:\\data_files\\employee.ser"));
			out.writeObject(employee);
			out.close();
			System.out.printf("Serialized data is saved in c:\\data_files\\employee.ser");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}
}
