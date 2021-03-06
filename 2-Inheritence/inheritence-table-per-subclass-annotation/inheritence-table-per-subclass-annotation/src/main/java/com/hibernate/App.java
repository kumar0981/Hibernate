package com.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

import com.shashank.inheritence.models.ContractEmployee;
import com.shashank.inheritence.models.Employee;
import com.shashank.inheritence.models.RegularEmployee;

public class App 
{
	public static void main( String[] args )
	{

		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();

		Employee e1= new Employee();
		e1.setName("shashank2");

		RegularEmployee re= new RegularEmployee();
		re.setName("Raj2");
		re.setSal(10000*2);

		ContractEmployee ce1= new ContractEmployee();
		ce1.setName("Salman2");
		ce1.setContractPerHours(2000*2);

		Session session = sf.openSession();
		session.beginTransaction();
		session.save(e1);
		session.save(re);
		session.save(ce1);
		session.getTransaction().commit();

		sf.close();

	}
}
