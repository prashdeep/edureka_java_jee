package com.edureka.java_j2ee.module3;

public abstract class Student {

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + attendance_count;
		result = prime * result + ((college_name == null) ? 0 : college_name.hashCode());
		result = prime * result + ((grade == null) ? 0 : grade.hashCode());
		result = prime * result + (int) (student_id ^ (student_id >>> 32));
		result = prime * result + ((student_name == null) ? 0 : student_name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Student)) {
			return false;
		}
		Student other = (Student) obj;
		if (attendance_count != other.attendance_count) {
			return false;
		}
		if (college_name == null) {
			if (other.college_name != null) {
				return false;
			}
		} else if (!college_name.equals(other.college_name)) {
			return false;
		}
		if (grade != other.grade) {
			return false;
		}
		if (student_id != other.student_id) {
			return false;
		}
		if (student_name == null) {
			if (other.student_name != null) {
				return false;
			}
		} else if (!student_name.equals(other.student_name)) {
			return false;
		}
		return true;
	}

	private long student_id;
	private String student_name;

	private String college_name;
	private Grade grade;

	private int attendance_count;

	void setAttendance_count(int attendance_count) {
		this.attendance_count = attendance_count;
	}
	protected int getAttendance_count() {
		return attendance_count;
	}

	private static Holidays generalHolidays;

	public Student(long student_id, String student_name, String college_name, Grade grade) {
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

	protected long getStudent_id() {
		return student_id;
	}

	protected void setStudent_id(long student_id) {
		this.student_id = student_id;
	}

	protected String getStudent_name() {
		return student_name;
	}

	protected void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	protected String getCollege_name() {
		return college_name;
	}

	protected void setCollege_name(String college_name) {
		this.college_name = college_name;
	}

	protected Grade getGrade() {
		return grade;
	}

	protected void setGrade(Grade grade) {
		this.grade = grade;
	}

	protected void printDetailsOfStudents() {
		System.out.println(" The details of the student is " + toString());
	}
	
	protected abstract void typeOfStudent();

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
