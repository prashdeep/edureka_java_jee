package com.edureka.java_j2ee.module3;

public class TestStudent {

	public static void main(String[] args) {
		Student pradeep = new RegularStudent(1, "Pradeep", "PES");
		Student praveen = new DistanceLearning(2, "Praveen", "PES", Grade.B);

/*		System.out.println(pradeep);
		System.out.println(praveen);*/

	/*	for (int i = 0; i < 60; i++) {
			pradeep.attendClass();
		}*/
		
		pradeep.attendClass();
		
		
		System.out.println(pradeep.getAttendance_count());
		
		//((RegularStudent)pradeep).applyLeave(5, "Going on a vacation");
		//((RegularStudent)pradeep).applyLeave(2);
		
		System.out.println(((RegularStudent)pradeep).canAppearForExam()?"Pradeep can appear for the exam":"Pradeep cannot appear for the exam");
		
		
		

//		System.out.println("Attendence count >> " + pradeep.attendance_count);
//		System.out.println("Can Pradeep appear for the exam >> " + pradeep.canAppearForExam());
//		
//		System.out.println("Attendence count >> " + praveen.attendance_count);
//		System.out.println("Can praveen appear for the exam >> " + praveen.canAppearForExam());
		
		//System.out.println(Student.getCalendarHolidays());
	}

}
