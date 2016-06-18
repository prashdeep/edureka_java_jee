package com.edureka.java_j2ee.module3;

public class Rectangle extends Shape {
	private float height;
	private float width;

	public Rectangle(float height, float width) {
		this.height = height;
		this.width = width;
	}

	@Override
	public double area() {
		return height * width;
	}
	
	public void testRectangle(){
		System.out.println("Printing from the rectangle class .");
	}

}
