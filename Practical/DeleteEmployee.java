package com.jpaeg;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteEmployee {
	
	@SuppressWarnings("deprecation")

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session s = sf.openSession();
		s.beginTransaction();
		
		Employee e3 = s.get(Employee.class, 3);
		s.delete(e3);
		System.out.println("deleted successfully");
		s.getTransaction().commit();
		s.close();
		sf.close();

	}

}
