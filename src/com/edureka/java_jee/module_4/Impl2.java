package com.edureka.java_jee.module_4;

public class Impl2 implements ICalculator {

	@Override
	public int add(int a, int b) {
		System.out.println("Returning the sum of two integers");
		return a + b;
	}

	@Override
	public int sub(int a, int b) {
		System.out.println("Returning the sub of two integers");
		return a - b;
	}

	@Override
	public int multiply(int a, int b) {
		System.out.println("Returning the mulitiplication of two integers");
		return a * b;
	}

}
