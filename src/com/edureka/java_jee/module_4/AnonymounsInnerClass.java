package com.edureka.java_jee.module_4;

public class AnonymounsInnerClass {

	public static void main(String[] args) {
		myInterface obj = new myInterface() {
			
			@Override
			public void display() {
				System.out.println("implemented by MyAwesomeDisplay class");
				
			}
		};
		obj.display();
	}
}

interface myInterface {
	public void display();
}