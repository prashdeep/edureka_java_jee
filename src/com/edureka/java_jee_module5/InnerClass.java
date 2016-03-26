package com.edureka.java_jee_module5;

public class InnerClass {
	class test {
		void display() {
			System.out.println("In the inner class display() method...");
		}
	}

	public static void main(String args[]) {
		InnerClass i = new InnerClass();
		InnerClass.test x = i.new test();

		x.display();
	}

}
