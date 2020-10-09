package com.edureka.package_one;

public class First {
	
	protected void test(){
		System.out.println("Testing");
		defaultMethod();
	}
	
	  void defaultMethod(){
		System.out.println("ONly accesible inside the package");
	}
}
