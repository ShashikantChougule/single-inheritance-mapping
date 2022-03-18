package com.training.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

<<<<<<< HEAD
import com.training.model.Employee;

public class HibernateUtil {
	
	private static SessionFactory factory;
	
	public static Session getSession() {
		return factory.openSession();
	}
	
	public static void closeSessionFactory() {
		factory.close();
	}
	
	static {
		Configuration configuration = new Configuration().configure()
				                                                                   .addAnnotatedClass(Employee.class);
		
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
=======
import com.training.model.CardPayment;
import com.training.model.ChequePayment;
import com.training.model.Payment;

public class HibernateUtil {

	private static SessionFactory factory;

	public static Session getSession() {
		return factory.openSession();
	}

	public static void closeSessionFactory() {
		factory.close();
	}

	static {
		Configuration configuration = new Configuration().configure().addAnnotatedClass(Payment.class)
				.addAnnotatedClass(CardPayment.class).addAnnotatedClass(ChequePayment.class);

		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
>>>>>>> 82b943a... inheritance mapping single table
		factory = configuration.buildSessionFactory(builder.build());
	}
}
