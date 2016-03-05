package com.edureka.java_jee_module5;

public class innerClass {
	class test {
		void display() {
			System.out.println("In the inner class display() method...");
		}
	}

	public static void main(String args[]) {
		innerClass i = new innerClass();
		innerClass.test x = i.new test();

		x.display();
	}

}
