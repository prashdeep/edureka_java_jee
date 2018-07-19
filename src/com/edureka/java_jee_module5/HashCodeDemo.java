package com.edureka.java_jee_module5;

public class HashCodeDemo {
	
	public static void main(String[] args) {
		Student student1 = new Student("Ashok", 12, "A");
		Student student2 = new Student("Ayush", 13, "B");
		Student student3 = new Student("Deepak", 11, "D");
		
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		System.out.println(student3.hashCode());
		System.out.println(student2.hashCode());
	}

}
