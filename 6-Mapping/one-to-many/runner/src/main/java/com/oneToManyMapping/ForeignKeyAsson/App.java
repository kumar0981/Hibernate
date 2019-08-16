package com.oneToManyMapping.ForeignKeyAsson;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SessionFactory sf = new AnnotationConfiguration().configure("hibernate2.cfg.xml").buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();
        
        Employee e1 = new Employee("shashank");
        Employee e2 = new Employee("siddharth");
        Employee e3 = new Employee("Pushkar");
        Employee e4 = new Employee("utsav");
        
        Account a1 = new Account("BOB",e1);
        Account a2 = new Account("IDBI",e1);
        Account a3 = new Account("HDFC",e2);
        Account a4 = new Account("SBI",e2);
        Account a5 = new Account("CITI",e3);
        Account a6 = new Account("BOB",e3);
        Account a7 = new Account("IDBI",e4);
        Account a8 = new Account("HDFC",e4);
        Account a9 = new Account("SBI",e1);
        Account a10 = new Account("CITI",e1);
       
        
        session.saveOrUpdate(e1);
        session.saveOrUpdate(e2);
        session.saveOrUpdate(e3);
        session.saveOrUpdate(e4);
        
        session.saveOrUpdate(a1);
        session.saveOrUpdate(a2);
        session.saveOrUpdate(a3);
        session.saveOrUpdate(a4);
        session.saveOrUpdate(a5);
        session.saveOrUpdate(a6);
        session.saveOrUpdate(a7);
        session.saveOrUpdate(a8);
        session.saveOrUpdate(a9);
        session.saveOrUpdate(a10);
        
        
        session.getTransaction().commit();
        sf.close();
    }
}
