package com.edureka.java_j2ee.module8.inheritance;

public abstract class Employee {
	private int id;
	private String name;

	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
