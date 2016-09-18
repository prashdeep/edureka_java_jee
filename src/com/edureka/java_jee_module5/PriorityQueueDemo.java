package com.edureka.java_jee_module5;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String args[]) {
		// create priority queue
		PriorityQueue<Integer> prq = new PriorityQueue<Integer>();

		// insert values in the queue
		for (int i = 1; i <= 10; i++) {
			prq.add(i);
		}

		System.out.println("Initial priority queue values are: " + prq);

		// get the head from the queue
		Integer head = prq.poll();

		System.out.println("Head of the queue is: " + head);

		System.out.println("Priority queue values after poll: " + prq);
		System.out.println("Now the head points to  >> "+prq.peek());
		System.out.println("Priority queue values after poll: " + prq);
	}
}
