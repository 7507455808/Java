package com.tph;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tph.entity.FeesDiscount;
import com.tph.entity.FeesNoDiscount;

import jakarta.transaction.Transaction;
import org.hibernate.cfg.Configuration;



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
    	fd.setSname("Pallavi");
    	fd.setEdu("EECS");
    	fd.setPhone(980654321);
    	fd.setCaste("SBC");
    	fd.setDiscount(5000);
    	fd.setFees(10000);
    	
    	s.save(fd);
    	s.save(fnd);
    	
    	System.out.println("inserted successfully");
    	
    	t.commit();
    	s.close();
    	
    	
    	
    }
}
