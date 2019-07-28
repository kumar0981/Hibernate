package com.hibernate.HQL;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

import com.hibernate.HQL.model.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	SessionFactory sessionFactory = new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
    	Session session = sessionFactory.openSession();
    	Query query = session.createQuery("select p from Product p");
    	List list = query.list();
    	Iterator iterator = list.iterator();
    	while(iterator.hasNext()){
    		Product p=(Product) iterator.next();
    		System.out.println("----------name of product is --------------"+p.getName());
    	}
    	
    	System.out.println("----------------------partial objects-------------------------");
    	
    	Query query2 = session.createQuery("select p.id,p.name from Product p");
    	List list2 = query2.list();
    	Iterator iterator2 = list2.iterator();
    	while(iterator2.hasNext()){
    		Object obj = iterator2.next();
    		Object[] arr = (Object[]) obj;
    		System.out.println("id is "+arr[0]);
    	}
    	
    	session.close();
    	sessionFactory.close();
    }
}
