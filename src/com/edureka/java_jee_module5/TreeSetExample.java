package com.edureka.java_jee_module5;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {

		TreeSet<String> set = new TreeSet<String>();
		set.add("Pradeep");
		set.add("Ajay");
		set.add("Navya");
		set.add("Jitesh");
		set.add("Jitesh");
		int i = 10;
		
		Integer iObj = 10;
		ArrayList<Integer> it = new ArrayList<Integer>();
		it.add(iObj);
		
		

		System.out.println(set);

		System.out.println(set.contains("Praveen"));

		System.out.println(set.contains("Vikram"));

	}

}
