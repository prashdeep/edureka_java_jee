package com.edureka.java_jee_module5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
	
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("Vinay");
		list.add("Kishore");
		list.add("John");
		
		ListIterator<String> it = list.listIterator();
		
		while(it.hasNext()) {
			String currentValue = it.next();
			System.out.println("The current value of ArrayList using list iterator forsard position"+currentValue);
		}
		
		while(it.hasPrevious()) {
			String currentValue = it.previous();
			System.out.println("The current value of ArrayList using list iterator in reverse position "+currentValue);
		}
	}

}
