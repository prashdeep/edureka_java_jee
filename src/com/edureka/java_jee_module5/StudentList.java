package com.edureka.java_jee_module5;

import java.util.ArrayList;

public class StudentList {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<Student>();

		Student std1 = new Student("Ramesh");
		std1.setAge(20);

		Student std2 = new Student("Pranay");
		std2.setAge(26);

		Student std3 = new Student("Ramesh");
		std3.setAge(28);

		studentList.add(std1);
		studentList.add(std2);

		studentList.add(std3);
		
		java.util.Collections.sort(studentList);

		System.out.println(studentList);
	}

	public static void acceptStudentArray(Student[] array) {

	}

}
