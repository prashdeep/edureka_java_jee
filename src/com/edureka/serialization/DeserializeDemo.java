package com.edureka.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {

	public static void main(String[] args) {
		Employee employee = null;
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("c:\\data_files\\employee.ser"));
			employee = (Employee) in.readObject();
			in.close();
		} catch (IOException i) {
			i.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("Employee class not found");
			c.printStackTrace();
			return;
		}

		System.out.println("Deserialized Employee...");
		System.out.println("Name: " + employee.getName());
		System.out.println("Address: " + employee.getAddress());
		System.out.println("SSN: " + employee.getSSN());
		System.out.println("Number: " + employee.getNumber());
	}
}
