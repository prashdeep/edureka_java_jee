package com.edureka.java_j2ee.module8.annotation;

import java.util.List;
import java.util.Date;
import java.util.Iterator;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class ManageEmployee {

	private static ServiceRegistry serviceRegistry;
	private static SessionFactory factory;

	public static void main(String[] args) {

		try {
			Configuration configuration = new Configuration();
			configuration.configure("/com/edureka/java_j2ee/module8/annotation/hibernate.cfg.xml");
			serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties())
					.buildServiceRegistry();
			factory = configuration.buildSessionFactory(serviceRegistry);

		} catch (Throwable ex) {
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}

		ManageEmployee ME = new ManageEmployee();

		/* Add few employee records in database */
		Integer empID1 = ME.addEmployee("Pradeep", "Ali", 1000);

		Integer empID2 = ME.addEmployee("Daisy", "Das", 5000);
		Integer empID3 = ME.addEmployee("John", "Paul", 10000);

		System.out.println("Employee id " + empID1 + ", " + empID2 + ", " + empID3);

		/* List down all the employees */
		ME.listEmployees();

		ME.updateEmployee(empID1);
		
		ME.deleteEmployee(empID1);

	}

	private void deleteEmployee(Integer empID1) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		try {
			Employee employee = (Employee) session.get(Employee.class, empID1);
			if (employee != null) {
				employee.setFirstName("UpdatedName");
				session.delete(employee);
				tx.commit();
			}
		} catch (Exception e) {
			tx.rollback();
		} finally {
			session.close();
		}

		
	}

	private void updateEmployee(Integer empID1) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		try {
			Employee employee = (Employee) session.get(Employee.class, empID1);
			if (employee != null) {
				employee.setFirstName("UpdatedName");
				session.save(employee);
				tx.commit();
			}
		} catch (Exception e) {
			tx.rollback();
		} finally {
			session.close();
		}

	}

	/* Method to CREATE an employee in the database */
	public Integer addEmployee(String fname, String lname, int salary) {
		Session session = factory.openSession();
		Transaction tx = null;
		Integer employeeID = null;
		try {
			tx = session.beginTransaction();

			Employee employee1 = new Employee();
			employee1.setFirstName(fname);
			employee1.setLastName(lname);
			employee1.setSalary(salary);
			employee1.setAge(45);
			employee1.setDoj(new Date());
			employeeID = (Integer) session.save(employee1);
			tx.commit();
		} catch (Exception e) {
			System.out.println(e);
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return employeeID;
	}

	/* Method to READ all the employees */
	public void listEmployees() {
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			List employees = session.createQuery("FROM Employee").list();
			for (Iterator iterator = employees.iterator(); iterator.hasNext();) {
				Employee employee = (Employee) iterator.next();
				System.out.print("First Name: " + employee.getFirstName());
				System.out.print("  Last Name: " + employee.getLastName());
				System.out.println("  Salary: " + employee.getSalary());
			}
			tx.commit();
		} catch (Exception e) {
			System.out.println("Came inside the excception catch block");
			if (e != null)
				throw new NullPointerException("throwing exception intentialnnay");
			System.out.println("Should not get printed");
			/*
			 * if (tx != null) tx.rollback(); e.printStackTrace();
			 */
		} finally {
			System.out.println("Printing this statement from the finally block");
			session.close();
		}
	}

}