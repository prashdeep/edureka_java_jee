package com.edureka.java_jee.module_4;

public class ExceptionCaller {

	public static void main(String[] args) {
		ExceptionCallee callee = new ExceptionCallee();
		double returnValue = 0;
		try {
			returnValue = callee.withdraw(12344, 200000);
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("The result is : " + returnValue);
	}

}
