package com.edureka.java_j2ee.module8;

import java.util.List;
import java.util.Iterator;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Client {
	
	private static ServiceRegistry serviceRegistry;
	private static SessionFactory factory;

	public static void main(String[] args) {
		try {
			Configuration configuration = new Configuration();
			configuration.configure("/com/edureka/java_j2ee/module8/hibernate.cfg.xml");
			serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties())
					.buildServiceRegistry();
			factory = configuration.buildSessionFactory(serviceRegistry);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
		
		Client client = new Client();

		// Add some records to the database */
		Integer id1 = client.addRecord("Johny", "Travol", 10);
        Integer id2 = client.addRecord("Kevin", "Becker", 20);
		Integer id3 = client.addRecord("Bruce", "Almighty", 30);

		/* Update a record */
		client.updateRecord(1, 5000);

		/* Delete */
		client.deleteRecord(3);

		/* List the records */
		 //client.listRecords();
	}

	/* CREATE a record in the database */
	public Integer addRecord(String fname, String lname, int salary) {
		Session session = factory.openSession();
		Transaction tx = null;
		Integer id = null;
		try {
			tx = session.beginTransaction();
			Person p = new Person(fname, lname, salary);
			id = (Integer) session.save(p);
			tx.commit();
		} catch (Exception e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return id;
	}

	/* READ all the records */
	public void listRecords() {
		Session session = factory.openSession();
		try {
			List<Person> ppl = session.createQuery("FROM Person").list();
			Iterator<Person> itr = ppl.iterator();
			while (itr.hasNext()) {
				Person p = (Person) itr.next();
				System.out.println(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	/* UPDATE a column in the DB */
	public void updateRecord(Integer id, int salary) {
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Person p = (Person) session.get(Person.class, id);
			p.setSalary(salary);
			session.update(p);
			tx.commit();
		} catch (Exception e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	/* Method to DELETE from the records */
	public void deleteRecord(Integer id) {
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Person p = (Person) session.get(Person.class, id);
			session.delete(p);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}