package com.edureka.java_jee_module5;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class IntegerComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		if (o1 > o2) {
			return -1;
		} else if (o2 > o1) {
			return 1;
		} else {
			return 0;
		}
	}

}

class StudentAgeComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.getAge() > o2.getAge()) {
			return -1;
		} else if (o2.getAge() > o1.getAge()) {
			return 1;
		} else {
			return 0;
		}
	}
}

class StudentNameComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o2.getName().compareTo(o1.getName());
	}
}

class StudentGradeComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getGrade().compareTo(o2.getGrade());
	}
}

public class PriorityQueueDemo {

	public static void main(String args[]) {
		// create priority queue
		PriorityQueue<Student> prq = new PriorityQueue<>((o1, o2) -> o2.getName().compareTo(o1.getName()));
		PriorityQueue<Student> prq2 = new PriorityQueue<>((o1, o2) -> {
			if (o2.getAge() > o1.getAge()) {
				return 1;
			} else if (o1.getAge() > o2.getAge()) {
				return -1;
			} else {
				return 0;
			}
		});

		Student student1 = new Student("Ashok", 12, "A");
		Student student2 = new Student("Ayush", 13, "B");
		Student student3 = new Student("Deepak", 11, "D");

		prq.add(student1);
		prq.add(student2);
		prq.add(student3);

		System.out.println(prq.peek());

		// PriorityQueue<Integer> prq = new PriorityQueue<Integer>();

		/*
		 * for (int i = 0; i < 10; i ++) { prq.add(i); }
		 * 
		 * System.out.println(prq.poll());; System.out.println(prq.poll());;
		 * System.out.println(prq.poll());; System.out.println(prq.poll());;
		 * //System.out.println(prq.peek()); System.out.println(prq);
		 */
	}
}
