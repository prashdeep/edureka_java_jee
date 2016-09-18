package com.edureka.java_jee.module_4.threads;

public class ThreadRunMethod extends Thread{
	
	public void run(){
		System.out.println("Called from the child thread - "+Thread.currentThread().getName());
		System.out.println("Before going to sleep ..");
		try {
			Thread.sleep(40000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("After the sleep function..");
		
	}
	
	public static void main(String[] args) {
		ThreadRunMethod thread = new ThreadRunMethod();
		thread.setName("child thread");
		thread.start();
		System.out.println("Printing the main thread "+Thread.currentThread().getName());
	}

}
