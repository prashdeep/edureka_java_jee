package com.edureka.java_jee_module5;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<Employee> employeeSet = new HashSet<>();

		Employee emp1 = new Employee(1, "Pradeep", 30, "HR");
		Employee emp2 = new Employee(1, "Pradeep", 30, "ProjectA");
		Employee emp3 = new Employee(1, "Pradeep", 30, "ProjectA");
						
		System.out.println(emp2.hashCode());
		System.out.println(emp3.hashCode());
		
		employeeSet.add(emp1);
		employeeSet.add(emp2);
		employeeSet.add(emp3);
		System.out.println(employeeSet);
		
		System.out.println(employeeSet.contains( new Employee(1, "Pradeep", 30, "ProjectA")));
	}

}

class Employee {
	long id;
	String name;
	int age;
	String department;

	public Employee(long id, String name, int age, String department) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.department = department;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", department=" + department + "]";
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	


}
