package com.edureka.java_jee_module5;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<>();

		queue.add(34);
		queue.add(20);
		queue.add(10);
		queue.add(50);
		queue.add(2);
		queue.add(45);
		queue.add(21);
		
		while(!queue.isEmpty()){
			int removedItem = queue.poll();
			System.out.println(removedItem);
		}
		
		System.out.println("Is queue empty >> "+queue.isEmpty());

	}

}
