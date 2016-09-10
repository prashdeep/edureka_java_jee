package com.edureka.java_jee.module_4;

import java.util.Scanner;

public class CalculatorClient {
	public static void main(String[] args) {
		ICalculator cal = getImplementigClass();
		System.out.println(cal.add(4, 8));
		cal.print();
		;

	}

	private static ICalculator getImplementigClass() {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		if (str.equals("one")) {
			return new MyConcreteImplOne();
		} else {
			return new ImplementationTwo();
		}
	}

}
