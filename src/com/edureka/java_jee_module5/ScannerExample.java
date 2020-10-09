package com.edureka.java_jee_module5;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		System.out.println("Please enter another number");
		int number2 = sc.nextInt();
		System.out.println("Please enter sum/sub/mult option");
		String operation = sc.next();
		switch (operation) {
		case "sum":
			System.out.println(number1 + number2);
			break;
		case "sub":
			System.out.println(number1 - number2);
			break;
		case "mult":
			System.out.println(number1 * number2);
			break;			
		default:
			System.out.println(number1 + number2);
			break;
		}
		sc.close();
	}
}
