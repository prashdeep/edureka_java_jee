package com.edureka.java_j2ee.innerclass;

 class Outer{
	private int number;
	
	private void display() {
		System.out.println("The value of number is "+number);
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
     public class Inner {
		public void printNumber() {
			display();
		}
		
	}
}

public class InnerClassDemo {
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.setNumber(45);
		Outer.Inner inner = outer.new Inner();
		//inner.printNumber();
		
		Outer.Inner inner2 = new Outer().new Inner();
		inner2.printNumber();
	}
	

}
