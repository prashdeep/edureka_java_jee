package com.edureka.module6;

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
		
		Employee employee = new Employee();
		employee.setFirstName("Pradeep");
		employee.setLastName("Kumar");
		employee.setId(12);
		employee.setIncome(2000.00);
		
		Employee employee2 = new Employee();
		employee2.setFirstName("Vinay");
		employee2.setLastName("Kumar");
		employee2.setId(14);
		employee2.setIncome(5000.00);
		
		Employee employee3 = new Employee();
		employee3.setFirstName("Hari");
		employee3.setLastName("Shaw");
		employee3.setId(15);
		employee3.setIncome(9000.00);
		
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(employee);
		employeeList.add(employee3);
		employeeList.add(employee2);
		

		/*
		List<String> list = new ArrayList<String>();
		list.add("Pradeep");
		list.add("Praveen");
		list.add("Naveen");
		list.add("Ramesh");

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Keshav");
		map.put(2, "Kumar");

		obj.setEmpMap(map);
		obj.setList(list);*/

		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		//objectToJson(employeeList, gson);

		jsonToObject();

	}

	private static void jsonToObject() {
		Gson gson = new Gson();

		try {

			BufferedReader br = new BufferedReader(
					new FileReader("C://java_projects//src//com//edureka//file.json"));

			// convert the json string back to object
			List<Employee> obj = gson.fromJson(br, ArrayList<Employee>.class);
			System.out.println(obj);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void objectToJson(List<Employee> obj, Gson gson) {
		// convert java object to JSON format,
		// and returned as JSON formatted string
		String json = gson.toJson(obj);

		try {
			// write converted json data to a file named "file.json"
			FileWriter writer = new FileWriter("C://java_projects//src//com//edureka//file.json");
			writer.write(json);
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(json);
	}
}
