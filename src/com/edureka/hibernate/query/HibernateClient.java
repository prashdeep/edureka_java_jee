package com.edureka.hibernate.query;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateClient {
	
	private static SessionFactory factory = null;
	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("/com/edureka/hibernate/query/hibernate.cfg.xml");
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		factory = config.buildSessionFactory(serviceRegistry);
		
		insertStudent(1, "Kishore", new Date(), 12);
		insertStudent(2, "Kishore", new Date(), 10);
		insertStudent(3, "Kishore", new Date(), 8);
		insertStudent(4, "Kishore", new Date(), 5);
		insertStudent(5, "Kishore", new Date(), 3);
		insertStudent(6, "Kishore", new Date(), 78);
		insertStudent(7, "Kishore", new Date(), 32);
		insertStudent(8, "Kishore", new Date(), 11);
		insertStudent(9, "Kishore", new Date(), 12);
		insertStudent(10, "Kishore", new Date(), 15);
		
		//returnStudentByGrade();
		
		filterStudentByGrade();
	}
	private static void filterStudentByGrade() {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Criteria criteria = session.createCriteria(Student.class);
		criteria.add(Restrictions.gt("grade", 32));
		List<Student> list = criteria.list();
		System.out.println("Students filtered : "+list.size());
		Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
			Student student = it.next();
			System.out.println(student);
		}
		transaction.commit();
		
	}
	private static void returnStudentByGrade() {
		Session session = factory.openSession();
		org.hibernate.Transaction transaction = session.beginTransaction();
		List<Student> studentsList = session.createQuery("From Student order by grade desc").list();
		Iterator<Student> it = studentsList.iterator();
		while( it.hasNext()) {
			Student student = it.next();
			System.out.println(student);
		}
		transaction.commit();
		
	}
	private static void insertStudent(int id, String name, Date date, int grade) {
		Session session = factory.openSession();
		org.hibernate.Transaction transaction = session.beginTransaction();
		session.save(new Student(id, name, date,grade));
		transaction.commit();
		
	}

}
