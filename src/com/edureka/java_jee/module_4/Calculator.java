package com.edureka.java_jee.module_4;

import java.util.Scanner;

public class Calculator {

	public float divide(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the first number ....");
		int num1 = sc.nextInt();

		System.out.println("Please enter the second number ....");
		int num2 = sc.nextInt();
		float result=0.0f;
		try {
			result = num1 / num2;
		} catch (ArithmeticException exception) {
			System.out.println("Cannot divide the number with 0..");
		}
		System.out.println("The result of division is " + result);
	}

}
