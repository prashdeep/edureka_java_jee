package com.edureka.java_jee.module6;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class EmployeeJsonExample {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setFirstName("Pradeep");
		emp.setId(300);
		emp.setIncome(800000);
		emp.setLastName("Kumar");

		Employee emp1 = new Employee();
		emp1.setFirstName("Naveen");
		emp1.setId(301);
		emp1.setIncome(600000);
		emp1.setLastName("Gupta");

		Employee emp2 = new Employee();
		emp2.setFirstName("Krishna");
		emp2.setId(302);
		emp2.setIncome(600034);
		emp2.setLastName("Raj");

		List<Employee> empList = new ArrayList<>();

		empList.add(emp);
		empList.add(emp1);
		empList.add(emp2);

		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		String jsonStr = gson.toJson(empList);
		System.out.println(jsonStr);

		List<Employee> list = gson.fromJson(jsonStr, List.class);

		System.out.println(list.get(0) instanceof Employee);
		;
	}

}
