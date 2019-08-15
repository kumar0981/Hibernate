package com.hibernate._1To1_Mapping.Mapping.dto.foreignKeyAsson;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

public class Runner {
	public static void main(String[] args) {
		SessionFactory sessionFactory=null;
		Session session =null;
		Transaction tx=null;
		try {
			sessionFactory =new AnnotationConfiguration().configure("hibernate1.cfg.xml").buildSessionFactory();
			Country c1= new Country("India");
			Country c2= new Country("canada");
			Country c3= new Country("germany");
			Country c4= new Country("austria");
			Employee e1= new Employee("shashank", c1);
			Employee e2= new Employee("siddharth", c2);
			Employee e3= new Employee("pushkar", c3);
			Employee e4= new Employee("utsav", c4);

			session = sessionFactory.openSession();
			tx = session.beginTransaction();

			session.saveOrUpdate(c1);
			session.saveOrUpdate(c2);
			session.saveOrUpdate(c3);
			session.saveOrUpdate(c4);

			session.saveOrUpdate(e1);
			session.saveOrUpdate(e2);
			session.saveOrUpdate(e3);
			session.saveOrUpdate(e4);

			session.getTransaction().commit();
		}catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
		finally {
			sessionFactory.close();}

	}
}
