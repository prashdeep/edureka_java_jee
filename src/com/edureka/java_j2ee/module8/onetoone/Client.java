package com.edureka.java_j2ee.module8.onetoone;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Client {

	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();

		try {
			session.beginTransaction();
			Address address1 = new Address("OMR Road", "Chennai", "TN", "600097");
			Address address2 = new Address("Ring Road", "Banglore", "Karnataka", "560000");
			Student student1 = new Student("Eswar", address1);
			Student student2 = new Student("Joe", address2);
			session.save(student1);
			session.save(student2);
			session.getTransaction().commit();

		} catch (HibernateException e) {

			e.printStackTrace();
		} finally {
			session.close();
		}

	}

}
