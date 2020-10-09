package com.edureka.java_jee.module_4.threads;

import com.edureka.java_j2ee.module3.Student;

public class ThreadExample extends Thread {

	@Override
	public void run() {
		Student student = new Student();
		student.attendClass();
	}

	public void run(String demo) {
		System.out.println("Called insde the overloaded function");
		for (int i = 5; i > 0; i--) {
			System.out.println("Printing the name of the thread: " + Thread.currentThread().getName());
			System.out.println("The value of I is:  " + i);
		}
	}

	public static void main(String[] args) {
		// System.out.println(Thread.currentThread().getName());
		ThreadExample t1 = new ThreadExample();
		
		t1.setName("child thread");
		t1.start();
		MyNonExtendingThread obj = new MyNonExtendingThread();
		Thread t2 = new Thread(obj);
		t2.setName("Thread 2");
		t2.start();

		System.out.println("printing from the main thread....");
	}

}
