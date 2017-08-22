package com.edureka.java_jee.module_4;import com.edureka.java_jee.module_4.MyOuterClass.MyInnerClassDemo;

class MyOuterClass {

	private String name;
	public int age;

	private static String name2 = "Pradeep";

	public void outerMethod() {

		MyInnerClassDemo.printValues();
	}

	public static void display() {

	}

	public static class MyInnerClassDemo {
		/**
		 * MyInnerClassDemo() { name = "Pradeep"; age = 32; }
		 **/

		public static void printValues() {
			// System.out.println("The values of name and age are " + name + " ,
			// " + age);
			System.out.println(name2);
		}
	}
}

public class InnerClass {
	public static void main(String[] args) {

		// MyOuterClass innerObj = new MyOuterClass();
		// innerObj.outerMethod();

		MyOuterClass.MyInnerClassDemo innerObj = new MyOuterClass.MyInnerClassDemo();
		innerObj.printValues();
		
	}
}
