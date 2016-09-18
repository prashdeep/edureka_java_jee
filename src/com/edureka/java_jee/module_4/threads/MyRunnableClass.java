package com.edureka.java_jee.module_4.threads;

public class MyRunnableClass implements Runnable {
	@Override
	public void run() {
		for (int index = 0; index < 10; index++) {
			System.out
					.println("Thread name is " + Thread.currentThread().getName() + " printing the value of " + index);
		}
		System.out.println("Printed from the " + Thread.currentThread().getName());
	}

}
