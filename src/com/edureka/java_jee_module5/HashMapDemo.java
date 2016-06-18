package com.edureka.java_jee_module5;

import java.util.Hashtable;

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

		Hashtable<String, Student > map = new Hashtable<String,  Student>();
		map.put("Pradeep", pradeep );
		map.put( "Praveen", praveen);

		System.out.println(map.keySet());
		
		Student student = map.get("Pradeep");
		System.out.println(student.getName());

		//System.out.println(map);
	}

}
