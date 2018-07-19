package com.edureka.java_jee_module5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<String> linkedList = new ArrayList<>();
		linkedList.add("One");
		linkedList.add("two");
		linkedList.add("three");
		
		//System.out.println(linkedList.size());
		Iterator<String> iterator = linkedList.iterator();
		
		while(iterator.hasNext()) {
			String element = iterator.next();
			//System.out.println(element);
		}
		Employee emp1 = new Employee(12, "Pradeep", 23, "HR");
		Employee emp3 = new Employee(12, "Pradeep", 23, "HR");
		Employee emp2 = emp1;
		System.out.println(emp1.equals(emp3));
		
	}

}
