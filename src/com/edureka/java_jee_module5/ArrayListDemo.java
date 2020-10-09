package com.edureka.java_jee_module5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		int[] array = new int[10];
		
		List<Integer> intList = new ArrayList<>();
		intList.add(45);
		intList.add(56);
		intList.add(5);
		intList.add(67);
		intList.add(45);
		intList.add(56);
		intList.add(5);
		intList.add(67);

		// 1. traditional for loop
		/*for(int loop = 0; loop < intList.size(); loop++) {
			System.out.println(intList.get(loop));
		}*/
		
		//for each
		//we cannot use the index
		/*for(Integer val: intList) {
			System.out.println(val);
		}*/
		
		//3. Iterator
		/*Iterator<Integer> iterator = intList.iterator();
		while(iterator.hasNext()) {
			Integer element = iterator.next();
			System.out.println(element);
		}*
		
		//4. ListIterator
		 
		 
		
		/*List<Object> newList = new ArrayList<>();
		newList.addAll(intList);

		int result = 0;
		
		for(Integer val : intList) {
			result += val;
		}*/
		
		ListIterator<Integer> listIterator = intList.listIterator();
		
		while(listIterator.hasNext()) {
			int element = listIterator.next();
			System.out.println(element);
		}
		System.out.println("------------------------------------");
		while(listIterator.hasPrevious()) {
			int elem = listIterator.previous();
			System.out.println(elem);
		}
		
		
	}
}
