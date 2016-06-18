package com.edureka.java_jee_module5;

 class MyOuterClass {
	private String name;

	public int age;
	
	public void outerMethod(){
		MyInnerClassDemo obj = new MyInnerClassDemo();
		obj.printValues();
	}

	private class MyInnerClassDemo {
		MyInnerClassDemo(){
			name="Pradeep";
			age=32;
		}
		public void printValues() {
			System.out.println("The values of name and age are " + name + " , " + age);
		}
	}
	private class MyInnerClassDemo2 {
		MyInnerClassDemo2(){
			name="Pradeep";
			age=32;
		}
		public void printValues() {
			System.out.println("The values of name and age are " + name + " , " + age);
		}
	}
}

public class InnerClass {
	public static void main(String[] args) {

		MyOuterClass innerObj = new MyOuterClass();
		innerObj.outerMethod();
	}
}
