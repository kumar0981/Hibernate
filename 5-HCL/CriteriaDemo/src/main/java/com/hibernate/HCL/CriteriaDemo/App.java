package com.hibernate.HCL.CriteriaDemo;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

import com.hibernate.HCL.CriteriaDemo.model.Employees;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
    	Session session = sf.openSession();
    	Criteria criteria = session.createCriteria(Employees.class);
    	Criterion criterion = Restrictions.eq("empno", 10001);
    	criteria.add(criterion);
    	List list = criteria.list();
    	Iterator itr=list.iterator();
    	while(itr.hasNext()){
    		Employees data = (Employees)itr.next();
    		System.out.println(" empno "+data.getEmpno()+" name "+data.getFirstName()+" "+data.getLastName()+" dob "+data.getDob()+" hire date "+
    				data.getHireDate()+" gender "+data.getG());
    		System.out.println("------------------------------------------");
        	
    	}
    	
    	System.out.println("==============================================================");

    	Criteria criteria2 = session.createCriteria(Employees.class);
    	LogicalExpression rest = Restrictions.and(Restrictions.eq("g", "F"), Restrictions.gt("g", 48000));
		Criterion c = Restrictions.and(Restrictions.like("firstName", "%georg%"), rest);
    	criteria.add(c);
    	List list2 = criteria2.list();
    	Iterator itr2=list2.iterator();
    	while(itr2.hasNext()){
    		Employees data = (Employees)itr2.next();
    		System.out.println(" empno "+data.getEmpno()+" name "+data.getFirstName()+" "+data.getLastName()+" dob "+data.getDob()+" hire date "+
    				data.getHireDate()+" gender "+data.getG());
    		System.out.println("------------------------------------------");
        	
    	}
    }
}
