package com.hibernate.compositekey.CompositeKeyRunner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.hibernate.compositekey.Model.Address;
import com.hibernate.compositekey.Model.Employee;
import com.hibernate.compositekey.Model.EmployeeId;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	SessionFactory sf =new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
    	
    	EmployeeId eid = new EmployeeId();
    	eid.setDepartment("CSE");
    	eid.setEmp_id(1);
    	
    	Address a = new Address();
    	a.setCity("deoghar");
    	a.setHouse("ShyamSadan");
    	
    	Employee e = new Employee();
    	e.setEid(eid);
    	e.setName("Shashank");
    	e.setAddress(a);
    	
    	
    	Session session =sf.openSession();
    	session.beginTransaction();
    	session.save(e);
    	session.getTransaction().commit();
    	
    	System.out.println("--------------------retreiving--------------");
    	
    	Employee e1=(Employee) session.get(Employee.class, eid);
    	System.out.println(e1.getEid().getEmp_id());
    	System.out.println(e1.getAddress().getHouse());
    	
    	sf.close();
    }
}
