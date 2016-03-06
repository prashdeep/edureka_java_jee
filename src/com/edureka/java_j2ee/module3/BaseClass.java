
package com.edureka.java_j2ee.module3;

public class BaseClass extends Object {

	public int baseValue = 100;

	public BaseClass() {
		System.out.println("Called from within the constructor of the BaseClass");
	}

	static {
		System.out.println("Called from within the BaseClass static method");
	}

	{
		System.out.println("Called from within the instance initializer block of the BaseClass class");
	}

	public void callMe() {
		System.out.println("Called from within the callMe of the base class");
	}

}
