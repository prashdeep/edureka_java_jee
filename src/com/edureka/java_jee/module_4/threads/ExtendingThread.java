/**
 * 
 */
package com.edureka.java_jee.module_4.threads;


public class ExtendingThread extends Thread {

	@Override
	public void run(){
		for(int loop = 0; loop < 10; loop++){
			System.out.println("Printing from the child thread. "+Thread.currentThread().getName()+ "Index "+loop);
		}
		System.out.println("Completed the execution of the "+Thread.currentThread().getName()+" thread.");
	}
	

	public static void main(String[] args) {
		ExtendingThread childThread = new ExtendingThread();
		childThread.setName("Child Thread");
		childThread.start();
		childThread.setPriority(MAX_PRIORITY);
		Thread.currentThread().setPriority(MIN_PRIORITY);
		
		for(int index=0; index < 10; index++){
			System.out.println("Printing from the main thread. "+Thread.currentThread().getName()+" Index "+index);
		}
		
		System.out.println("Completed the execution of the "+Thread.currentThread().getName()+" thread.");

	}

}
