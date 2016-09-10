package com.edureka.java_jee.module_4;

public class ExceptionDemo {
	public static void main(String args[]) {
		System.out.println("Enter two numbers ....");

		int arg1 = 12;
		int arg2 = 0;
		int result = 0;
		try {
			result = arg1 / arg2;
		}

		catch (ArithmeticException exception) {
			System.out.println("Number cannot be divided by 0");
		}

		System.out.println("The result of division is " + result);

	}
}
