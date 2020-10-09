package com.edureka.java_jee_module_4.access_modifiers;

public class PublicAccessModifier {

	private int x;
	protected String data;

	protected String getData() {
		return data;
	}

	protected void setData(String data) {
		this.data = data;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getX() {
		int test;
		boolean flag = true;
		if (flag)
			test = 40;
		else
			test = 30;

		System.out.println(test);

		return this.x;
	}

	void print() {
		System.out.println("Printing the value inside the print method..");
	}

	private void test() {
		System.out.println("Visible only in this class....");
	}

}
