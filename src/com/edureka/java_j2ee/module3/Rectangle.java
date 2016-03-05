package com.edureka.java_j2ee.module3;

public class Rectangle extends Shape {
	private float height;
	private float width;

	Rectangle(float height, float width) {
		this.height = height;
		this.width = width;
	}

	@Override
	public float area() {
		return height * width;
	}

	public static void main(String[] args) {
		Shape r = new Rectangle(20, 40);
		System.out.println(r.area());
	}

}
