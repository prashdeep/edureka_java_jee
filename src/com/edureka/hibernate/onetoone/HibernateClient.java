package com.edureka.hibernate.onetoone;


import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateClient {
	
	private static SessionFactory sessionFactory;

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("/com/edureka/hibernate/onetoone/hibernate.cfg.xml");
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
	    sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	    
	    saveOneToOneMapping();
	}

	private static void saveOneToOneMapping() {
		Person person = new Person();
		SSN ssn = new SSN();
		ssn.setSsn(24);
		ssn.setCity("Bangalore");
		ssn.setIssuedDate(new Date());
		person.setId(1);
		person.setFirstName("Pradeep");
		person.setLastName("Kumar");
		person.setSsn(ssn);
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(ssn);
		session.save(person);
		transaction.commit();
		
		session.close();
	}

}
