package com.edureka.java_j2ee.module3;

public class BaseClass {

	public int baseValue = 100;

	public BaseClass() {
		//System.out.println("Called from within the constructor of the BaseClass");
		//System.out.println("This is the call to BaseClass constuctor....");
	}
	
	public BaseClass(int baseVal) {
		//this.baseValue = baseVal;
		//System.out.println("Called the overloaded constructor");
	}

	/**static {
		System.out.println("Called from within the BaseClass static method");
	}

	{
		System.out.println("Called from within the instance initializer block of the BaseClass class");
	}**/

	public  void callMe(String str) {
		System.out.println("Called from within the callMe of the base class");
	}
	
	public void sayHello(){
		System.out.println("Hello students. lets learn Inheritance today..");
	}
	
	public static void tell(){
		System.out.println("printing the tell from static method..");
	}
}
