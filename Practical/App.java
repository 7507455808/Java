package com.tps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import jakarta.transaction.Transaction;
import org.hibernate.cfg.Configuration;

import com.tps.entity.FeesDiscount;
import com.tps.entity.FeesNoDiscount;



public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sf = new Configuration().configure().buildSessionFactory();
    	Session s = sf.openSession();
    	org.hibernate.Transaction t = s.beginTransaction();
    	
    	FeesNoDiscount fnd = new FeesNoDiscount();
    	fnd.setSname("Pooja");
    	fnd.setEdu("BEIT");
    	fnd.setPhone(987654321);
    	fnd.setCaste("OBC");
    	fnd.setFees(15000);
    	fnd.setCourse("Java");
    	
    	FeesDiscount fd = new FeesDiscount();
    	fd.setSname("Prem");
    	fd.setEdu("EECS");
    	fd.setPhone(980654321);
    	fd.setCaste("SBC");
    	fd.setDiscount(5000);
    	fd.setFees(10000);
    	fd.setCourse("Python");
    	
    	s.save(fd);
    	s.save(fnd);
    	
    	System.out.println("inserted successfully");
    	
    	t.commit();
    	s.close();
    	
    	
    	
    }
}
