package com.edureka.java_jee.module_4;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {

	public static void main(String[] args) {
		int[] array =  { 4, 5, 6, 7, 8, 3, 1, 9, 10 };
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the index to retrieve from the array ");
		int index = sc.nextInt();
		
		try {
			System.out.println("The value is " + array[index]);
			
			throw new IllegalArgumentException("Array index out of Bounds Exception");
		} catch (ArrayIndexOutOfBoundsException  | NullPointerException exception) {
			System.out.println("Invalid Input "+exception.getMessage());
		} catch(Exception e) {
			System.out.println("There is an issue. Please report a bug. "+e);
		} finally {
			System.out.println("This should be called after printing the element.");
			sc.close();
		}
		
		
	}

}
