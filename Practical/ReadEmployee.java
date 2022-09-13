package com.jpaeg;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;



public class ReadEmployee {
	
	@SuppressWarnings({ " deprecation", "rawtypes","unchecked"})

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session s = sf.openSession();
		s.beginTransaction();
		
		Query q = s.createQuery("from Employee");
		
		List<Employee> emp = q.list();
		for(Employee e1:emp)
			System.out.println(e1.getId() + " " + e1.getFname() + " "+ e1.getLname() + " "+ e1.getEmail() + " " + e1.getPhone() + " " + e1.getDesignation());
		s.getTransaction().commit();
		s.close();
		sf.close();
			
		
		

	}

}
