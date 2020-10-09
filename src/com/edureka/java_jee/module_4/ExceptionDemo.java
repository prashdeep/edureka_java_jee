package com.edureka.java_jee.module_4;

import java.util.Scanner;


public class ExceptionDemo {

	public static void main(String args[]) throws InvalidAgeException {
		System.out.println("Please enter you age in years ..");
		Scanner sc = new Scanner(System.in);
		int age  = sc.nextInt();
		String str = null;
		
		str.concat("sdfdsfdsf");

	
		 validateAge(age);
		
		
		sc.close();
	}

	private static void validateAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("The minimum age for voting should be 18.");
		}
		if (age > 100) {
			throw new MaxAgeException("The max age for voting should be 65.");
		}
		
	}
}
