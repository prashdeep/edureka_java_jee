package com.edureka.java_j2ee.module3;

public final class Square extends Shape {

	private float length;
	
	public static int count = 0;
	public final int NO_OF_SIDES = 4;
	
	public Square(float length){
		this.length = length;
	}

	@Override
	public double area(){
		count++;
		return length*length;
	}
	
	public void printLength(){
		System.out.println("Printing the length ..."+ length);
	}
	
	public static  void countTimes(){
		System.out.println("The area functioin has been called "+count+"  times ");
	}
	
}
