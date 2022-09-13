package com.jpaeg;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateEmployee {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session s =sf.openSession();
		s.beginTransaction();
		
		Employee e2 = s.get(Employee.class, 4);
		e2.setPhone(900123467);
		
		
		System.out.println("updated successfully");
		s.getTransaction().commit();
		s.close();
		sf.close();
		
	
	}

}
