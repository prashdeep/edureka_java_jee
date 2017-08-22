package com.edureka.java_jee.module_4;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {

	public static void main(String[] args) {
		int[] array = new int[] { 4, 5, 6, 7, 8, 3, 1, 9, 10 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the index to retrieve from the array ");
		//try {
			int index = sc.nextInt();
			System.out.println("The value is " + array[index]);
		//} catch (Exception ex) {
		//	System.out.println("Please enter a valid integer between 0 and 9");
		//}
		System.out.println("This should be called after printing the element.");
		sc.close();
	}

}
