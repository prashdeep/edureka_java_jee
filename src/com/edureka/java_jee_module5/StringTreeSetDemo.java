package com.edureka.java_jee_module5;

import java.util.Iterator;
import java.util.TreeSet;

public class StringTreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Student> studentSet = new TreeSet<>();

		studentSet.add(new Student("Prakash", 22, "A"));
		studentSet.add(new Student("Praveen", 18, "B"));
		studentSet.add(new Student("Vivek", 20, "C"));
		studentSet.add(new Student("Dhanajay", 19, "A"));

		System.out.println("Initial size >> "+studentSet.size());

		/*for (Student student : studentSet) {
			if (student.getName().equals("Prakash")) {
				studentSet.remove(student);
			}
		}*/
		
		/*Iterator<Student> it = studentSet.iterator();
		while(it.hasNext()){
			Student student = it.next();
			if (student.getName().equals("Prakash")) {
				it.remove();
			}
		}
		
		System.out.println("Final list >> "+studentSet.size());*/
		
		System.out.println(studentSet);
		

	}

}
