package com.edureka.java_j2ee.module3;

public abstract class Student {

	long student_id;
	String student_name;

	String college_name;
	Grade grade;

	int attendance_count;

	static Holidays generalHolidays;

	public Student(long student_id, String student_name, String college_name, Grade grade) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.college_name = college_name;
		this.grade = grade;
	}
	public Student(long student_id, String student_name, String college_name) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.college_name = college_name;
		this.grade = Grade.A;
	}

	public long getStudent_id() {
		return student_id;
	}

	public void setStudent_id(long student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getCollege_name() {
		return college_name;
	}

	public void setCollege_name(String college_name) {
		this.college_name = college_name;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public void printDetailsOfStudents() {
		System.out.println(" The details of the student is " + toString());
	}
	
	public abstract  void typeOfStudent();

	public void attendClass() {
		this.attendance_count++;
	}

	public static String getCalendarHolidays() {

		StringBuilder holidays = new StringBuilder();
		holidays.append(Holidays.DEEPAWALI + ", ");
		holidays.append(Holidays.HOLI + ", ");
		holidays.append(Holidays.NEWYEAR + ", ");
		holidays.append(Holidays.SANKRANTHI + ", ");

		return holidays.toString();

	}

	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_name=" + student_name + ", college_name=" + college_name
				+ ", grade=" + grade + "]";
	}

}

enum Grade {
	A, B, C
}

enum Holidays {
	SANKRANTHI, HOLI, DEEPAWALI, NEWYEAR
}
