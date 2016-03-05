package com.edureka.java_jee_module5;

public class AnonymounsInnerClass {

	public static void main(String[] args) {
		Thread t = new Thread(new Thread() {

			@Override
			public void run() {
				System.out.println("Inside the run method..");

			}
		});

		t.start();

	}

}
