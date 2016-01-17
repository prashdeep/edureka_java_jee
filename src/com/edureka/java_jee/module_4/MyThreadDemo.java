package com.edureka.java_jee.module_4;

public class MyThreadDemo extends Thread{

@Override
public void run(){
	for(int index=0; index < 10; index++){
		System.out.println("Thread name is "+Thread.currentThread().getName()+ " printing the value of "+index);
	}
	System.out.println("Printed from the "+Thread.currentThread().getName());
}

public static void main(String[] args) {
	MyThreadDemo thread = new MyThreadDemo();
	thread.setName("Child Thread");
	thread.start();
	
	for(int index=0; index < 10; index++){
		System.out.println(Thread.currentThread().getName()+ " priting the index value as " +index);
	}
	System.out.println("Printed from the "+Thread.currentThread().getName());
}
	
	
}
