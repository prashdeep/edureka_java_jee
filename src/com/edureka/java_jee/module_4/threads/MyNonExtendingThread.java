package com.edureka.java_jee.module_4.threads;

import com.edureka.java_j2ee.module3.Student;

public class MyNonExtendingThread extends Student implements Runnable {

	@Override
	public void run() {
		for (int i = 20; i > 0; i--) {
			System.out.println("i: " + i);
		}
	}

}
