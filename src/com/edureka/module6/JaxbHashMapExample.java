package com.edureka.module6;

import java.io.File;
import java.util.HashMap;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JaxbHashMapExample {
	public static void main(String[] args) throws JAXBException {
		HashMap<Integer, Employee> map = new HashMap<Integer, Employee>();

		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setFirstName("Pradeep");
		emp1.setLastName("Kumar");
		emp1.setIncome(1003444.0);

		Employee emp2 = new Employee();
		emp2.setId(2);
		emp2.setFirstName("Kiran");
		emp2.setLastName("Patel");
		emp2.setIncome(20088.0);

		map.put(1, emp1);
		map.put(2, emp2);

		// Add employees in map
		EmployeeMap employeeMap = new EmployeeMap();
		employeeMap.setEmployeeMap(map);

		/******************** Marshalling example *****************************/
/**
		JAXBContext jaxbContext = JAXBContext.newInstance(EmployeeMap.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		jaxbMarshaller.marshal(employeeMap, System.out);
		jaxbMarshaller.marshal(employeeMap,
				new File("C://data_files//employees_useg_jaxb.xml"));

		System.out.println("############################################################################");
		*/

		/********************
		 * Unmarshalling example
		 *****************************/

		JAXBContext jaxbContext = JAXBContext.newInstance(EmployeeMap.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		EmployeeMap empMap = (EmployeeMap) jaxbUnmarshaller
				.unmarshal(new File("C://data_files//employees_useg_jaxb.xml"));

		for (Integer empId : empMap.getEmployeeMap().keySet()) {
			System.out.println(empMap.getEmployeeMap().get(empId).getFirstName());
			System.out.println(empMap.getEmployeeMap().get(empId).getLastName());
		}
	
	}
}
