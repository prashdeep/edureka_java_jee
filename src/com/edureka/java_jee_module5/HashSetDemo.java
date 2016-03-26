package com.edureka.java_jee_module5;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();

		set.add("Praveen");
		set.add("Ram");
		set.add("Ramesh");
		set.add("Ajay");
		

		System.out.println(set);
		
		System.out.println(set.contains("Praveen"));
		
		System.out.println(set.contains("Vikram"));
	}
}
