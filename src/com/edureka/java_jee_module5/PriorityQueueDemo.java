package com.edureka.java_jee_module5;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String args[]) {
		// create priority queue
		PriorityQueue<Integer> prq = new PriorityQueue<Integer>();

		for (int loop = 10; loop > 0; loop--) {
			prq.add(loop);
		}
		System.out.println(prq.size());
		int size = prq.size();

		// System.out.println(prq.peek());

		for (int index = 0; index < size; index++) {
			// System.out.println(prq.poll());
			prq.poll();
		}
		System.out.println(prq);

	}
}
