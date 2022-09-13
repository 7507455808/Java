package com.jpaeg;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
	@SuppressWarnings("deprecation")
    public static void main( String[] args )
    {
		//Configuration - activates hibernate framework
		//configure - read both cfg files & mapping details
		//buildSessionFactory - from cfg object it takes jdbc information & create a jdbc
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		//open an connection with db & session object perform CRUD
		Session s = sf.openSession();
		
		//save permanently any operation performed on db 
		Transaction t = s.beginTransaction();
		
		//object of persistent class
		Employee e = new Employee();
		e.setId(1);
		e.setFname("Pooja");
		e.setLname("Rathod");
		e.setEmail("pooja@gmail.com");
		e.setPhone(987000321);
		e.setDesignation("Manager");
		
		//save persistent class object e
		s.save(e);
		t.commit();
		
		System.out.println("inserted successfully");
		
		s.close();
		sf.close();
		
		
    	
    }
}
