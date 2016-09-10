package com.edureka.java_jee.module_4.threads;

class Printer {
	public void printCount() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Counter for "+Thread.currentThread().getName()+" ---   " + i);
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			System.out.println("Thread  interrupted.");
		}
	}
}

class PrinterService extends Thread {
	private Thread t;
	private String threadName;
	Printer printer;

	PrinterService(String name, Printer pd) {
		threadName = name;
		printer = pd;
	}

	public void run() {
		synchronized (printer) {
			printer.printCount();
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

		Printer printer = new Printer();

		PrinterService job1 = new PrinterService("JOB- 1 ", printer);
		PrinterService job2 = new PrinterService("JOB - 2 ", printer);
		
		job1.initialize();
		job2.initialize();

		// wait for threads to end
		try {
			job1.join();
			job2.join();
		} catch (Exception e) {
			System.out.println("Interrupted");
		}
	}
}