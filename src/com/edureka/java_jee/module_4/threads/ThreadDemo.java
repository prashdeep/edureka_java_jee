package com.edureka.java_jee.module_4.threads;

public class ThreadDemo {
	
	public static void main(String[] args) throws InterruptedException {
		String currentThread = Thread.currentThread().getName();
		
		System.out.println("The default thread is "+currentThread);
		System.out.println("Going to sleep state");
		Thread.sleep(2000);
		
		System.out.println("After awaking from sleep state");
	}

}
