package com.edureka.java_j2ee.module8.onetoone;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
  
public class HibernateUtil {
  
    private static  SessionFactory sessionFactory = buildSessionFactory();
    private static ServiceRegistry serviceRegistry;
	
  
    private static SessionFactory buildSessionFactory() {
    	try {
			Configuration configuration = new Configuration();
			configuration.configure("/com/edureka/java_j2ee/module8/onetoone/hibernate.cfg.xml");
			serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties())
					.buildServiceRegistry();
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			return sessionFactory;

		} catch (Throwable ex) {
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}
    }
  
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
  
    public static void shutdown() {
        // Close caches and connection pools
        getSessionFactory().close();
    }
  
}
