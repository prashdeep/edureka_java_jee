package com.edureka.java_j2ee.module8.criterias;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Client {
	private static ServiceRegistry serviceRegistry;
	private static SessionFactory factory;

	// Obtains the session factory.
	public static void getSessionFactory() {

		try {
			Configuration configuration = new Configuration();
			configuration.configure("/com/edureka/java_j2ee/module8/criterias/hibernate.cfg.xml");
			serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties())
					.buildServiceRegistry();
			factory = configuration.buildSessionFactory(serviceRegistry);

		} catch (Throwable ex) {
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static void main(String[] args) {

		try {

			getSessionFactory();
			Client client_1 = new Client();

			/* Add few employee records in database */
			Integer empID1 = client_1.InsertRecordInDatabase(1, "Zara", "Ali", 3000);
			Integer empID2 = client_1.InsertRecordInDatabase(2, "Daisy", "Das", 11000);
			Integer empID3 = client_1.InsertRecordInDatabase(3, "John", "Paul", 8000);
			Integer empID4 = client_1.InsertRecordInDatabase(4, "Mohd", "Yasee", 1000);

			/* List down all the employees */
			client_1.DisplayRecords();
		} catch (HibernateException e) {
			System.out.println("Exception is : " + e);
		}
	}

	/* Method to CREATE an employee in the database */
	public Integer InsertRecordInDatabase(int id, String fname, String lname, int salary) throws HibernateException {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		;

		Employee e1 = new Employee(id, fname, lname, salary);
		Integer empId = (Integer) session.save(e1);
		tx.commit();

		session.close();
		return empId;
	}

	/* To display all the records */
	public void DisplayRecords() throws HibernateException {
		Session session = factory.openSession();
		Criteria cr = session.createCriteria(Employee.class);

		cr.add(Restrictions.le("salary", 2000));
		List employees = cr.list();

		for (Iterator iterator = employees.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			System.out.print("First Name: " + employee.getFirstName());
			System.out.print("  Last Name: " + employee.getLastName());
			System.out.println("  Salary: " + employee.getSalary());
		}

		session.close();
	}

}
