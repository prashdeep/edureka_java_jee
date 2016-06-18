package com.edureka.java_jee_module5;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Pradeep");
		list.add("Praveen");
		list.add("John");
		list.add("Bob");

		//System.out.println(list);
		
		Iterator<String> it = list.iterator();
		
		list.push("");;
		
		
		while(it.hasNext()){
			String name = it.next();
			System.out.println("The name is "+name);
		}
		
		list.push("Ramesh");
		System.out.println(list);
		
	}

}
