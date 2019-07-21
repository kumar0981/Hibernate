package com.shashank.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.shashank.hibernate.model.Product;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		Product p= new Product();
		p.setId(1);
		p.setName("pen");
		
		SessionFactory sessionFactory = new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}
