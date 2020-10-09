package com.edureka.java_jee.module_4;

public class ImplementationTwo implements ICalculator, PrintInterface {

	@Override
	public int add(int a, int b) {
		System.out.println("Printing from the addition function ");
		System.out.println("The sum is "+(a+b));
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		System.out.println("Printing from the sub function ");
		System.out.println("The sub is "+(a-b));
		return a-b;
	}

	@Override
	public int multiply(int a, int b) {
		System.out.println("Printing from the multiply function ");
		System.out.println("The multiply is "+(a*b));
		return a*b;
	}

	@Override
	public int mod(int a, int b) {
		System.out.println("Printing from the mod function ");
		System.out.println("The mod is "+(a%b));
		return a%b;
	}

	@Override
	public void print() {
		System.out.println("Inside print two");
		
	}
	
	public void test(){
		System.out.println("Testing accuracy..");
	}

}
