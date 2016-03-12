package com.edureka.java_jee.module_4.threads;

class PrintDemo {
	public void printCount() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Counter   ---   " + i);
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			System.out.println("Thread  interrupted.");
		}
	}
}

class ThreadDemo extends Thread {
	private Thread t;
	private String threadName;
	PrintDemo PD;

	ThreadDemo(String name, PrintDemo pd) {
		threadName = name;
		PD = pd;
	}

	public void run() {
		synchronized (PD) {
			PD.printCount();
		}
		System.out.println("Thread " + threadName + " exiting.");
	}

	public void initialize() {
		System.out.println("Starting " + threadName);
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
}

public class SynchronizeThread {
	public static void main(String args[]) {

		PrintDemo PD = new PrintDemo();

		ThreadDemo thread1 = new ThreadDemo("Thread - 1 ", PD);
		ThreadDemo thread2 = new ThreadDemo("Thread - 2 ", PD);

		thread1.initialize();
		thread2.initialize();

		// wait for threads to end
		try {
			thread1.join();
			thread2.join();
		} catch (Exception e) {
			System.out.println("Interrupted");
		}
	}
}