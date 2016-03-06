package com.edureka.java_jee.module_4;

import java.util.Scanner;

public class UncheckedExceptionDemo {

	public static void main(String[] args) throws Exception{
		System.out.println("Enter two numbers ....");
		Scanner sc = new Scanner(System.in);
		int arg1 = 0;
		int arg2 = 0;
		int result = 0;
		try {
			arg1 = Integer.parseInt(sc.next());
			arg2 = Integer.parseInt(sc.next());
			result = arg1 / arg2;

		} catch (NumberFormatException exception) {
			System.out.println("Please enter a valid number.. ");
			throw new Exception("Thre is no sufficient funds to withdraw");

		} catch (ArithmeticException exception) {
			System.out.println("Number cannot be divided by 0");
		} catch (Exception ex) {
			System.out.println("Some other exception caught..");
		}

		finally {

			System.out.println("Called in any case from the finally blcok.");
			sc.close();
		}

		System.out.println("Entered numbers are " + arg1 + " & " + arg2);

		System.out.println("The sum is " + result);

	}
}
