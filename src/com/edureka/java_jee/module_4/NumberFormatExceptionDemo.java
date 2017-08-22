package com.edureka.java_jee.module_4;

import java.util.Scanner;

public class NumberFormatExceptionDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a valid integer....");

		String str = sc.next();
		int value = 0;
		try {
			value = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			System.out.println("Please enter a numeric value..");
		}
		System.out.println("The value is " + value);
	}

}
