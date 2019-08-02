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
		p.setId(6);
		p.setName("pen6");
		
		SessionFactory sessionFactory = new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		
		SessionFactory sf1=new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session s1=sf1.openSession();
		Product productObj = (Product) s1.load(Product.class, 2);
		System.out.println("-------------loaded object ----------"+productObj.getId());
		sf1.close();
		
		Session s2=new AnnotationConfiguration().configure().buildSessionFactory().openSession();
		s2.beginTransaction();
		Product objToBeDelated = (Product) s2.load(Product.class, 2);
		s2.delete(objToBeDelated);
		s2.getTransaction().commit();
		s2.close();
		
		Session s3=new AnnotationConfiguration().configure().buildSessionFactory().openSession();
		s3.beginTransaction();
		Product objToBeUpdated = (Product) s3.load(Product.class, 3);
		objToBeUpdated.setName("paper");
		s3.saveOrUpdate(objToBeUpdated);
		s3.getTransaction().commit();
		s3.close();
	}
}
