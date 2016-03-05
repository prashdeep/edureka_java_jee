package com.edureka.java_j2ee.module3;

public class ClassCallHirearchy extends BaseClass{
	
	public ClassCallHirearchy(){
		System.out.println("Called from withing the ClassCallHirearchy constructor");
	}
	
	static{
		System.out.println("Called from within the ClassCallHirearchy static block.");
	}
	
	public static void main(String[] args) {
		
		ClassCallHirearchy obj = new ClassCallHirearchy();
		
	}

}
