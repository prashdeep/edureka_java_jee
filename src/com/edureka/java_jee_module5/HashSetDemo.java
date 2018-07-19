package com.edureka.java_jee_module5;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetDemo {
	public static void main(String[] args) {
		Student ram = new Student("Ram", 14, "A");
		Student ram2 = new Student("Ram", 14, "A");
		HashSet<Student> set = new HashSet<>();
		set.add(ram);
		set.add(ram2);
		
		System.out.println(set.contains(ram2));
		System.out.println("HashCOde before update" +ram2.hashCode());
		ram2.setAge(15);
		System.out.println("HashCOde after update" +ram2.hashCode());
		System.out.println(set.contains(ram2));
		
	}
}
