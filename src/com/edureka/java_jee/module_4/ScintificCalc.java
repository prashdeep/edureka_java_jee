package com.edureka.java_jee.module_4;

public class ScintificCalc implements ICalculator{



	@Override
	public int add(int a, int b) {
		System.out.println("Called fron the scientific cal class");
	  return a+b;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int mod(int a, int b) {
		// TODO Auto-generated method stub
		return a %b;
	}

}
