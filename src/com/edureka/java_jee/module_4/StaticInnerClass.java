package com.edureka.java_jee.module_4;

public class StaticInnerClass {
	static int data = 30;
	private void testMethod(){
		System.out.println("Inside the test method....");
	}

	private static void test() {
		System.out.println("Inside the static function called test");
	}

	static class Inner extends Thread{
		void msg() {
			System.out.println("data is " + data);
			test();
			//testMethod();
		}

	}

	public static void main(String args[]) {
		StaticInnerClass.Inner obj = new StaticInnerClass.Inner();
		obj.msg();
	}
}