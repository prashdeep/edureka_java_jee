package com.edureka.java_jee.module_4;

public class AnonymounsInnerClass {

	MyInterface obj;
	public AnonymounsInnerClass(MyInterface obj) {
		// TODO Auto-generated constructor stub
		this.obj = obj;
	}
	
	public void print() {
		obj.display();
	}
	
	public static void main(String[] args) {
	
	
	 }
	
	
}

@FunctionalInterface
interface MyInterface {
	public void display();

}


