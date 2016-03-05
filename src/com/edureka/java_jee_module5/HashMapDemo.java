package com.edureka.java_jee_module5;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		Student pradeep = new Student();
		pradeep.setName("Pradeep");
		pradeep.setAge(32);
		pradeep.setGrade("2nd Sem");

		Student praveen = new Student();
		praveen.setName("Praveen");
		praveen.setAge(30);
		praveen.setGrade("3rd Sem");

		HashMap<Student, String> map = new HashMap<Student, String>();
		map.put(pradeep, "Pradeep");
		map.put(praveen, "Praveen");

		System.out.println(map.keySet());

		// System.out.println(map);
	}

}
