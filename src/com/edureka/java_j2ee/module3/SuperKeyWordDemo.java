package com.edureka.java_j2ee.module3;

class Employee {
	float salary = 10000;
}

class HR extends Employee {
	float salary = 20000;

	void printSalary() {
		System.out.println("Salary is : " +salary);// print current class salary
	}
}

public class SuperKeyWordDemo {

	public static void main(String[] args) {
		HR obj = new HR();
		obj.printSalary();
	}
}
