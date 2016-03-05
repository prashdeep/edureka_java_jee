package com.edureka.java_j2ee.module3;

public class RegularStudent extends Student {

	public RegularStudent(long student_id, String student_name, String college_name, Grade grade) {
		super(student_id, student_name, college_name, grade);
	}
	public RegularStudent(long student_id, String student_name, String college_name) {
		super(student_id, student_name, college_name);
	}

	public void applyLeave(int noOfDays) {
		this.setAttendance_count(this.getAttendance_count() - noOfDays);
	}
	
	public void applyLeave(int noOfDays, String reason) {
		this.setAttendance_count(this.getAttendance_count() - noOfDays);
		System.out.println("Applying "+noOfDays+" for "+reason);
	}

	public void typeOfStudent() {
		System.out.println("The student type is Regular");
	}

	public boolean canAppearForExam() {
		if (this.getAttendance_count() < 50) {
			return false;
		}
		return true;
	}

}
