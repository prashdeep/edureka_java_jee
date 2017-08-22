package com.edureka.java_j2ee.module8.ehcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class EhcacheTest {

	private static ServiceRegistry serviceRegistry;
	private static SessionFactory factory;

	public static void main(String[] args) throws InterruptedException {
		Configuration configuration = new Configuration();
		configuration.configure("/com/edureka/java_j2ee/module8/ehcache/hibernate.cfg.xml");
		serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties())
				.buildServiceRegistry();
		factory = configuration.buildSessionFactory(serviceRegistry);
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		Employee emp = new Employee();
		
		emp.setName("Pradeep");
		emp.setSalary(112222.40f);
		session.persist(emp);
		
		t.commit();
		session.close();

		Session session1 = factory.openSession();
		
		Employee emp1 = (Employee) session1.load(Employee.class, 1);
		System.out.println(emp1.getId() + " " + emp1.getName() + " " + emp1.getSalary());
		session1.close();

		Session session2 = factory.openSession();
		Employee emp2 = (Employee) session2.load(Employee.class, 1);
		System.out.println(emp2.getId() + " " + emp2.getName() + " " + emp2.getSalary());
		session2.close();
		
		Session session5 = factory.openSession();
		Transaction t2 = session5.beginTransaction();
		Employee oldEmployee = (Employee) session5.load(Employee.class, 1);
		oldEmployee.setName("Pradeep Kumar");
		oldEmployee.setSalary(44444.40f);
		session5.update(oldEmployee);
		
		t2.commit();
		session5.close();
		
		Session session3 = factory.openSession();
		Employee emp3 = (Employee) session3.load(Employee.class, 1);
		System.out.println(emp3.getId() + " " + emp3.getName() + " " + emp3.getSalary());
		session3.close();
		
		
		
		Session session4 = factory.openSession();
		Employee emp4 = (Employee) session4.load(Employee.class, 1);
		System.out.println(emp4.getId() + " " + emp4.getName() + " " + emp3.getSalary());
		session4.close();


	}
}
