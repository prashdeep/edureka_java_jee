package com.edureka.java_jee.module_4.threads;

public class MyThreadDemo extends Thread {

	@Override
	public void run() {
		
		String name  = "Pradeep";
		for (int index = 0; index < 10; index++) {
			System.out
					.println("Thread name is " + Thread.currentThread().getName() + " printing the value of " + index);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Printed from the " + Thread.currentThread().getName());
	}

	public static void main(String[] args) throws InterruptedException {
		MyThreadDemo thread = new MyThreadDemo();
		thread.setName("Child Thread");
		thread.start();

		for (int index = 0; index < 10; index++) {
			Thread.sleep(4000);
			System.out.println(Thread.currentThread().getName() + " priting the index value as " + index);
		}
		System.out.println("Printed from the " + Thread.currentThread().getName());
	}

}
