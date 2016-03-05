package com.edureka.java_jee.module_4;

import java.io.IOException;

public class CheckedExceptionDemo {

	public int accessingFile() throws Exception {
		// some file operioin or connecting to some other sytem.
		int value = 10;
		try {
			// connect the other system to get the information
			value = 1000;
			throw new IOException();
		} catch (IOException exception) {
			throw new MyBuisinessException("Unable to contact the external system.");
		}
	}

	class MyBuisinessException extends Exception {
		private String message;

		MyBuisinessException() {

		}

		MyBuisinessException(String exception) {
			message = exception;
		}

		@Override
		public String getMessage() {
			return message;
		}
	}

	public static void main(String args[]) {
		CheckedExceptionDemo obj = new CheckedExceptionDemo();
		try {
			System.out.println(obj.accessingFile());
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}

	}

}
