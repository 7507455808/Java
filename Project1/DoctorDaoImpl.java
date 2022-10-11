package com.sprint1project.daoimpl;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.sprint1project.entity.Doctor;
import com.sprint1project.config.HibernateUtil;
import com.sprint1project.dao.DoctorDao;
import com.sprint1project.entity.Doctor;
import com.sprint1project.dao.DoctorDao;
import com.sprint1project.entity.Doctor;

public class DoctorDaoImpl implements DoctorDao {
	int i;
	Scanner sc = new Scanner(System.in);
	Session session = HibernateUtil.getSessionFactory().openSession();
	Transaction t = session.beginTransaction();
	Doctor d = session.get(Doctor.class, i);
	
	
	@SuppressWarnings("deprecation")
	public void getDoctorBy() {
		//Session session = HibernateUtil.getSessionFactory().openSession();
		System.out.println("Enter doctor id");
		i = sc.nextInt();
		System.out.println(d.getDaddr() + " " + d.getDfname() + " " + d.getDfname() + " " + d.getDemail() + " " + d.getDphone() + " " + d.getDaddr());
	}
	@SuppressWarnings("deprecation")
	public void addDoctorBy() {
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
		
		Doctor d = new Doctor();
		d.setDfname(f);
		d.setDfname(l);
		d.setDemail(e);
		d.setDphone(p);
		d.setDaddr(a);
		
		session.save(d);
		t.commit();
		
	}

	public void updateDoctor() {
	//	Session session = HibernateUtil.getSessionFactory().openSession();
		System.out.println("Enter Doctor id");
		i = sc.nextInt();
		Doctor dd2 = session.get(Doctor.class, i);
				System.out.println("Enter phone number");
		long pp = sc.nextLong();
		dd2.setDphone(pp);
		session.update(dd2);
		t.commit();
		
	}

	public void deleteDoctor() {
	//	Session session = HibernateUtil.getSessionFactory().openSession();
		System.out.println("Enter Doctor id");
		i = sc.nextInt();
		Doctor dd1 = session.get(Doctor.class, i);
		session.delete(dd1);
		System.out.println("delete successfully");
		t.commit();
		
	}

}
