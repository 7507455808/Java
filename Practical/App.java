package com.HbOnetoOneBi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.HbOnetoOneBi.Entity.Address;
import com.HbOnetoOneBi.Entity.Employee;


public class App 
{
	@SuppressWarnings("deprecation")
    public static void main( String[] args )
    {
    	SessionFactory sf = new Configuration().configure().buildSessionFactory();
    			
    			// open an connection with db & session object perform CRUD
    			Session s = sf.openSession();
    	// save permanently any operation performed on db
    	Transaction t = s.beginTransaction();
    	
    	Employee e = new Employee();
    	e.setEid(101);
    	e.setEname("Pooja");
    	e.setEphone(987654321);
    	e.setProfile("Developer");
    	e.setDept("IT");
    	
    	Address a = new Address();
    	a.setAid(1);
    	a.setAddr("Xyz Society, room 2");
    	a.setCity("Mumbai");
    	a.setState("MH");
    	a.setPincode(400703);
    	
    	e.setAddress(a);
    	a.setEmployee(e);
    	
    	s.save(e);
    	s.save(a);
    	
    	t.commit();
    	
    	s.close();
    	sf.close();
    	
    }
}
