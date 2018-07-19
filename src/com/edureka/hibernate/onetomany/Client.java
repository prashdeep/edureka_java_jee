package com.edureka.hibernate.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

public class Client {

	public static void main(String[] args) {

		System.out.println("Hibernate one to many (Annotation)");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();

		Car car1 = new Car();
		car1.setChassieNumber(12345);
		car1.setModel("Baleno");
		
		Car car2 = new Car();
		car2.setChassieNumber(12345);
		car2.setModel("Baleno");
		
		Car car3 = new Car();
		car3.setChassieNumber(12345);
		car3.setModel("Baleno");
		
		Car car4 = new Car();
		car4.setChassieNumber(12345);
		car4.setModel("Baleno");
		
		User user = new User();
		user.setName("Pradeep");
		
		List<Car> cars = new ArrayList<>();
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		user.setCars(cars);
		
		car1.setUser(user);
		car2.setUser(user);
		car3.setUser(user);
		car4.setUser(user);
		
		session.save(user);
		
		session.getTransaction().commit();
		
		session.close();
		System.out.println("Done");
	}

}
