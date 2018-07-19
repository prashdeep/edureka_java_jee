package com.edureka.java_jee.module_4;


class MyOuterClass {

	private static String name = "Pradeep";
	
	public static int age = 22;

	private static void newDisplayFunction() {
		System.out.println("The values of name and age is"+ name+" age -> "+age );
      
	}
	
	void anotherMethod() {
		newDisplayFunction();
	}

	protected static class MyInnerClassDemo {
		public void printValues() {
			newDisplayFunction();
		}
	}
}

public class InnerClass {
	public static void main(String[] args) {
		MyOuterClass outer = new MyOuterClass();
		MyOuterClass.MyInnerClassDemo innerObj = new MyOuterClass.MyInnerClassDemo();
		MyOuterClass.MyInnerClassDemo innerObj2 = new MyOuterClass.MyInnerClassDemo();
		
		innerObj.printValues();

	}
}
