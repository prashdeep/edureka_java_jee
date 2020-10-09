package com.edureka.java_jee.module_4.threads;

public class ThreadLogic2 extends Thread{
	@Override
	public void run(){
		
		for (int i = 20; i > 0; i--){
			System.out.println("i: "+i);
		}
		
	}
	
}
