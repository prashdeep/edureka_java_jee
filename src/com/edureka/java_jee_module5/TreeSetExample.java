package com.edureka.java_jee_module5;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {

		TreeSet<Student> studentSet = new TreeSet<Student>();
		studentSet.add(new Student("Prakash", 22, "A"));
		studentSet.add(new Student("Praveen", 18, "B"));
		studentSet.add(new Student("Vivek", 20, "C"));
		studentSet.add(new Student("Dhanajay", 19, "A"));

		
		

		System.out.println(studentSet);

		System.out.println(studentSet.contains(new Student("Praveen", 18, "B")));

		System.out.println(studentSet.contains(new Student("Praveen", 18, "B")));

	}

}
