package com.edureka.java_j2ee.module3;

public class DistanceLearning extends Student{

	public DistanceLearning(long student_id, String student_name, String college_name, Grade grade) {
		super(student_id, student_name, college_name, grade);
	}
	
	public void takeBreakFromSemister(){
		System.out.println("Taken break from semister.");
		this.setAttendance_count(0);
	}
	
	public void typeOfStudent(){
		System.out.println("The student type is DistanceLearning");
	}

}
