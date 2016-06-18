package com.edureka.java_jee.module_4;

public abstract class ImplementationOne implements ICalculator, PrintInterface{

	

	@Override
	public int sub(int a, int b) {
		return a-b;
	}

	@Override
	public int multiply(int a, int b) {
		return a*b;
	}

	@Override
	public int mod(int a, int b) {
		return a % b;
	}

	@Override
	public void print() {
		System.out.println("Printing the imple one");
	}

}

class MyConcreteImplOne extends ImplementationOne{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
}
