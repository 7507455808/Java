package com.HbOnetoOneBi;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.HbOnetoOneBi.Entity.Address;
import com.HbOnetoOneBi.Entity.Employee;

import jakarta.persistence.Query;

public class FetchData {
	
	@SuppressWarnings({"rawtypes", "deprecation", "unchecked"})

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		// open an connection with db & session object perform CRUD
		Session s = sf.openSession();
		
		Query q = s.createQuery("from Employee");
		List<Employee> al = q.getResultList();
		
		Iterator<Employee> itr = al.iterator();
		while (itr.hasNext()) {
			Employee em = itr.next();
			
			System.out.println(em.getEid() + " " + em.getEname() + " " + em.getProfile() + " " + em.getDept());
			Address addr = em.getAddress();
			System.out.println(addr.getAid() + " " + addr.getAddr() + " " + addr.getCity() + " " + addr.getState());
			
			s.close();
			sf.close();
			
		}

	}

}
