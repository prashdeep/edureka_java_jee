package com.edureka.java_j2ee.module3;

public class ClassCallHirearchy extends BaseClass {

	public int baseValue = 200;
	

	public ClassCallHirearchy() {
		System.out.println("Called from withing the ClassCallHirearchy constructor");
	}

	static {
		System.out.println("Called from within the ClassCallHirearchy static block.");
	}
	
	//instance initializer block
	{
		System.out.println("Called from within the instance initializer block of the ClassCallHirearchy class");
	}

	public void callMe() {
		System.out.println("Called from within the callMe of the ClassCallHirearchy class");
	}

	public void printSuperClassValue() {
		System.out.println("The value of BaseClass baseValue is " + super.baseValue);
		System.out.println("The value of ClassCallHirearchy baseValue is " + this.baseValue);
	}

	public static void main(String[] args) {

		ClassCallHirearchy obj = new ClassCallHirearchy();
		//obj.callMe();
		//obj.printSuperClassValue();
	}

}
