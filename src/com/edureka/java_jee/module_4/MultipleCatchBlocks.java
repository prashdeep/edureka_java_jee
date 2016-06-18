package com.edureka.java_jee.module_4;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		try {
			String [] array = {};
			System.out.println(array);
			System.out.println("The length of the array is : "+args.length );

		} catch (ArithmeticException e) {
			System.out.println("printing from the arithmetic exception block");
			System.out.println(e);
		} catch (NullPointerException exception) {
			System.out.println("Printing from the null pointer exception block");
			System.out.println(exception);

		} catch (Exception genericException) {
			System.out.println("Printing from the generic exception block");
			System.out.println(genericException);
		} finally {
			System.out.println("This line will be printed since there  is an exception");

		}
	}

}
