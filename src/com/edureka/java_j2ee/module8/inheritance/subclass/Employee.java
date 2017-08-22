package com.edureka.java_j2ee.module8.inheritance.subclass;

public class Employee {
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
