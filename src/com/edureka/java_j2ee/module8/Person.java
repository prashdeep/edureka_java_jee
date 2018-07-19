package com.edureka.java_j2ee.module8;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // Required annotation
@Table(name = "PERSON_TABLE") // can be omitted if table name is exactly same as
								// Class
// name
// Entity, Domain Transfer Object, DTO, Model
public class Person {

	@Id // Required annotation
	@Column(name = "PERSON_ID") // can be omitted if column name is same as field-name
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "SALARY")
	private int salary;

	public Person() {
	}

	public Person(String firstName, String lastName, int salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + "]";
	}

}