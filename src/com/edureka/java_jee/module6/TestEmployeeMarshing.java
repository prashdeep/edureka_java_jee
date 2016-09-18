package com.edureka.java_jee.module6;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class TestEmployeeMarshing {
	static Employees employees = new Employees();

	static {
		employees.setEmployees(new ArrayList<Employee>());

		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setFirstName("Pradeep");
		emp1.setLastName("Kumar");
		emp1.setIncome(900000.0);

		Employee emp2 = new Employee();
		emp2.setId(2);
		emp2.setFirstName("Praveen");
		emp2.setLastName("Gupta");
		emp2.setIncome(8000000.0);
		
		Employee emp3 = new Employee();
		emp3.setId(2);
		emp3.setFirstName("Laxman");
		emp3.setLastName("Shah");
		emp3.setIncome(2000000.0);

		employees.getEmployees().add(emp1);
		employees.getEmployees().add(emp2);
		employees.getEmployees().add(emp3);
	}

	public static void main(String[] args) throws JAXBException {
		//marshalingExample();
		System.out.println("************************************************");
		unMarshalingExample();
	}

	private static void unMarshalingExample() throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(Employees.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Employees emps = (Employees) jaxbUnmarshaller
				.unmarshal(new File("C://Users//Prashdeep//my_projects//my-first-app//src//employees.xml"));

		for (Employee emp : emps.getEmployees()) {
			System.out.println(emp.getId());
			System.out.println(emp.getFirstName());
		}
	}

	private static void marshalingExample() throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(Employees.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		jaxbMarshaller.marshal(employees, System.out);
		jaxbMarshaller.marshal(employees,
				new File("C://Users//Prashdeep//my_projects//my-first-app//src//employees.xml"));
	}
}
