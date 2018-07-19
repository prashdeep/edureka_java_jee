package com.edureka.java_jee.module_4.threads;

import java.util.Date;
import java.util.List;

class Consumer implements Runnable {
	
	private final List<Integer> taskQueue;

	public Consumer(List<Integer> sharedQueue) {
		this.taskQueue = sharedQueue;
	}

	@Override
	public void run() {
		int counterVal = 10;
		while (counterVal > 0) {
			try {
				counterVal--;
				consume();
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

	private void consume() throws InterruptedException {
		synchronized (taskQueue) {
			while (taskQueue.isEmpty()) {
				System.out.println("Queue is empty " + Thread.currentThread().getName() + " is waiting , size: "
						+ taskQueue.size()+"Time: "+new Date(System.currentTimeMillis()));
				taskQueue.wait();
			}
			Thread.sleep(1000);
			int i = (Integer) taskQueue.remove(0);
			System.out.println("Consumed: " + i);
			taskQueue.notifyAll();
		}
	}
}
