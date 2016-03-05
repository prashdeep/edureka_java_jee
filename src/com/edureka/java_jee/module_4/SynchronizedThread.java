package com.edureka.java_jee.module_4;

class SPrintDemo {
	public void printCount() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Counter   ---   " + i);
			}
		} catch (Exception e) {
			System.out.println("Thread  interrupted.");
		}
	}

}

class SThreadDemo extends Thread {
	private Thread t;
	private String threadName;
	SPrintDemo PD;

	SThreadDemo(String name, SPrintDemo pd) {
		threadName = name;
		PD = pd;
	}

	public void run() {
		synchronized (PD) {
			PD.printCount();
		}
		System.out.println("Thread " + threadName + " exiting.");
	}

	public void start() {
		System.out.println("Starting " + threadName);
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}

}

public class SynchronizedThread {
	public static void main(String args[]) {

		SPrintDemo PD = new SPrintDemo();

		SThreadDemo T1 = new SThreadDemo("Thread - 1 ", PD);
		SThreadDemo T2 = new SThreadDemo("Thread - 2 ", PD);

		T1.start();
		T2.start();

		// wait for threads to end
		try {
			T1.join();
			T2.join();
		} catch (Exception e) {
			System.out.println("Interrupted");
		}
	}
}
