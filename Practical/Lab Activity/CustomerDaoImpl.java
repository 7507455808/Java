package com.sprint1.daoimpl;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sprint1.config.HibernateUtil;
import com.sprint1.dao.CustomerDao;
import com.sprint1.entity.Customer;
import com.sprint1.model.CustomerDTO;


public class CustomerDaoImpl implements CustomerDao {
	int i;
	Scanner sc = new Scanner(System.in);
	Session session = HibernateUtil.getSessionFactory().openSession();
	Transaction t = session.beginTransaction();
	Customer cd = session.get(Customer.class, i);
	
	@SuppressWarnings("deprecation")
	public void getCustomerBy() {
		//Session session = HibernateUtil.getSessionFactory().openSession();
				System.out.println("Enter customer id");
				i = sc.nextInt();
				System.out.println(cd.getCid() + " " + cd.getCfname() + " " + cd.getClname() + " " + cd.getCemail() + " " + cd.getCphone() + " " + cd.getCaddr());
	}
	@SuppressWarnings("deprecation")
	public void addCustomer() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		String f, l, e, a;
		long p;
		System.out.println("Enter first name");
		f = sc.next();
		System.out.println("Enter last name");
		l = sc.next();
		System.out.println("Enter email id");
		e = sc.next();
		System.out.println("Enter phone number");
		p = sc.nextLong();
		System.out.println("Enter address");
		a = sc.next();
		
		Customer c = new Customer();
		c.setCfname(f);
		c.setClname(l);
		c.setCemail(e);
		c.setCphone(p);
		c.setCaddr(a);
		
		session.save(c);
		t.commit();
	}
	@SuppressWarnings("deprecation")
	public void updateCustomer() {
//		Session session = HibernateUtil.getSessionFactory().openSession();
		System.out.println("Enter customer id");
		i = sc.nextInt();
		Customer cd2 = session.get(Customer.class, i);
				System.out.println("Enter phone number");
		long pp = sc.nextLong();
		cd2.setCphone(pp);
		session.update(cd2);
		t.commit();
	}
	@SuppressWarnings("deprecation")
	public void deleteCustomer() {
//		Session session = HibernateUtil.getSessionFactory().openSession();
		System.out.println("Enter customer id");
		i = sc.nextInt();
		Customer cd1 = session.get(Customer.class, i);
		session.delete(cd1);
		System.out.println("delete successfully");
		t.commit();
	}
	
		

}
		
		
		
		
		
		
	
	
	

