package com.edureka.java_jee.module6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonExample {
	public static void main(String[] args) {

		DataObject obj = new DataObject();

		List<String> list = new ArrayList<String>();
		list.add("Pradeep");
		list.add("Praveen");
		list.add("Naveen");
		list.add("Ramesh");

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Keshav");
		map.put(2, "Kumar");

		obj.setEmpMap(map);
		obj.setList(list);

		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		objectToJson(obj, gson);

		jsonToObject(obj);

	}

	private static void jsonToObject(DataObject objParam) {
		Gson gson = new Gson();

		try {

			BufferedReader br = new BufferedReader(
					new FileReader("C://Users//Prashdeep//my_projects//my-first-app//src//file.json"));

			// convert the json string back to object
			DataObject obj = gson.fromJson(br, DataObject.class);
			System.out.println(obj.equals(objParam));

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
