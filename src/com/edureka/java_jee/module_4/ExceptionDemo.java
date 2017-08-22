package com.edureka.java_jee.module_4;

public class ExceptionDemo {
	public static void main(String args[]) throws InvalidAgeException, MaxAgeException {
		int arg1 = 12;
		int arg2 = 0;
		int result = 0;
		int age = 2;

		if (age < 28) {
			throw new InvalidAgeException("The minimum age for voting should be 18.");
		}
		if (age > 100) {
			throw new MaxAgeException("The max age for voting should be 65.");
		}
		try {
			result = arg1 / arg2;
		} catch (ArithmeticException exception) {
			System.out.println("Number cannot be divided by 0");
			System.out.println(exception.getMessage());

		}

		System.out.println("This statement will be printed even in case of exception....");

	}
}
