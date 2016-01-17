package com.edureka.java_jee.module6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonExample {
	public static void main(String[] args) {

		DataObject obj = new DataObject();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		objectToJson(obj, gson);

		jsonToObject();

	}

	private static void jsonToObject() {
		Gson gson = new Gson();

		try {

			BufferedReader br = new BufferedReader(
					new FileReader("C://Users//Prashdeep//my_projects//my-first-app//src//file.json"));

			// convert the json string back to object
			DataObject obj = gson.fromJson(br, DataObject.class);

			System.out.println(obj);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void objectToJson(DataObject obj, Gson gson) {
		// convert java object to JSON format,
		// and returned as JSON formatted string
		String json = gson.toJson(obj);

		try {
			// write converted json data to a file named "file.json"
			FileWriter writer = new FileWriter("C://Users//Prashdeep//my_projects//my-first-app//src//file.json");
			writer.write(json);
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(json);
	}
}
