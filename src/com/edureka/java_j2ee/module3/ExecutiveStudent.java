package com.edureka.java_j2ee.module3;

public class ExecutiveStudent extends Student {

	public ExecutiveStudent(long student_id, String student_name, String college_name, Grade grade) {
		super(student_id, student_name, college_name, grade);
		// TODO Auto-generated constructor stub
	}
	public ExecutiveStudent(long student_id, String student_name, String college_name) {
		super(student_id, student_name, college_name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void typeOfStudent() {
		System.out.println("I am of type Execuitve Stundet.");
		
		
	}



}
