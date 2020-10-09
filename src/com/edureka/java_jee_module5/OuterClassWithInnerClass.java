package com.edureka.java_jee_module5;

public class OuterClassWithInnerClass {
	
	private int intVal;
	private String stringVal;
	
	public void method1() {
		System.out.println("Inside method1 ..");
	}
	
	private void privateMethod() {
		System.out.println("This is a private method is printing the value of intVal :: "+intVal);
	}
	
	class InnerClass{
		
		private void innerClassPrivateMethod() {
			intVal = 40;
			privateMethod();
		}
		
	}
	
	public static void main(String[] args) {
		OuterClassWithInnerClass obj = new OuterClassWithInnerClass();
		OuterClassWithInnerClass.InnerClass innerObj = obj.new InnerClass();
		
		OuterClassWithInnerClass.InnerClass innerObj2 = new OuterClassWithInnerClass().new InnerClass();
		innerObj.innerClassPrivateMethod();
	}

}
