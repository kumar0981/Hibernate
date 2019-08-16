package com.oneToManyMapping.joinTableAsson;

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
        SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();
        
        Account a1 = new Account("BOB");
        Account a2 = new Account("IDBI");
        Account a3 = new Account("HDFC");
        Account a4 = new Account("SBI");
        Account a5 = new Account("CITI");
        Account a6 = new Account("BOB");
        Account a7 = new Account("IDBI");
        Account a8 = new Account("HDFC");
        Account a9 = new Account("SBI");
        Account a10 = new Account("CITI");
        
        Set<Account> s1= new HashSet<Account>();
        s1.add(a1);s1.add(a2);s1.add(a3);s1.add(a4);s1.add(a5);
        
        Set<Account> s2= new HashSet<Account>();
        s2.add(a6);s2.add(a7);s2.add(a8);s2.add(a9);s2.add(a10);
        
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
        
        Employee e1 = new Employee("shashank", s1);
        Employee e2 = new Employee("siddharth", s2);
        
        session.saveOrUpdate(e1);
        session.saveOrUpdate(e2);
        
        session.getTransaction().commit();
        sf.close();
    }
}
