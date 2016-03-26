package com.edureka.java_jee_module5;

 class OuterClass {
	private int num = 25;

	// Accessing he inner class from the method within
	void display() {
		InnerClassDefinition inner = new InnerClassDefinition();
		inner.print();
		System.out.println("The value of the inner class object is " + inner.value);
	}

	// inner class
	protected class InnerClassDefinition {
		private int value = 60;

		 void print() {
			System.out.println("This is inside the inner class");
			System.out.println("The value of the number is " + num);
		}
	}

}

public class MyInnerClass {
	public static void main(String args[]) {
		// Instantiating the outer class
		OuterClass outer = new OuterClass();
		OuterClass.InnerClassDefinition innerObj = outer.new InnerClassDefinition();
		//outer.display();
		// Accessing the display_Inner() method.
		OuterClass.InnerClassDefinition inner = outer.new InnerClassDefinition();
		 inner.print();
	}

}
