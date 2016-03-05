package com.edureka.java_jee_module5;

public class StaticInnerClass {
	static int data = 30;

	private static void test() {
		System.out.println("Inside the static function called test");
	}

	static class Inner {
		void msg() {
			System.out.println("data is " + data);
			test();
		}
	}

	public static void main(String args[]) {
		StaticInnerClass.Inner obj = new StaticInnerClass.Inner();
		obj.msg();
	}
}