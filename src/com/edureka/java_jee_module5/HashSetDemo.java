package com.edureka.java_jee_module5;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<Student> studentSet = new HashSet<Student>();
		studentSet.add(new Student("Prakash", 22, "A"));
		studentSet.add(new Student("Prakash", 22, "A"));
		studentSet.add(new Student("Praveen", 18, "B"));
		studentSet.add(new Student("Vivek", 20, "C"));
		studentSet.add(new Student("Dhanajay", 19, "A"));

		System.out.println(studentSet);

		System.out.println(studentSet.contains(new Student("Praveen", 18, "B")));

		System.out.println(studentSet.contains(new Student("fdfdf", 19, "A")));
	}
}
