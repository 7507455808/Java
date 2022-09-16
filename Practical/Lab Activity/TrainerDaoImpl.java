package com.HbOnetoManyUni.daoimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.annotations.FetchProfile.FetchOverride;
import org.hibernate.query.Query;

import com.HbOnetoManyUni.Entity.Student;
import com.HbOnetoManyUni.Entity.Trainer;
import com.HbOnetoManyUni.config.HibernateUtil;
import com.HbOnetoManyUni.dao.TrainerDao;


public class TrainerDaoImpl implements TrainerDao{
	@SuppressWarnings("deprecation")
	public void addTrainer() {
		
		Session s = HibernateUtil.getSessionFactory().openSession();
		Transaction t =  s.beginTransaction();
		
		Trainer tt = new Trainer();
		tt.setTname("Mamta");
		tt.setCname("Java");
		tt.setDesignation("Senior Faculty");
		
		Student ss3 = new Student();
		ss3.setAid(104);
		ss3.setName("Pooja");
		ss3.setEmail("poo@gmail.com");
		ss3.setPhone(876543211);
		
		Student ss4 = new Student();
		ss4.setAid(105);
		ss4.setName("Prem");
		ss4.setEmail("prem@gmail.com");
		ss4.setPhone(876453211);
		
		Student ss5 = new Student();
		ss5.setAid(106);
		ss5.setName("Komal");
		ss5.setEmail("koma@gmail.com");
		ss5.setPhone(876544211);
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(ss3);
		al.add(ss4);
		al.add(ss5);
		
		tt.setStudent(al); // set student data with trainer object
		
		s.save(tt);
		t.commit();
		s.close();
		
	}
	
	public void fetchTrainer() {
	Session s = HibernateUtil.getSessionFactory().openSession();
	Query<Trainer> q = s.createQuery("from Trainer");
		List<Trainer> ll = q.getResultList();
		
		Iterator<Trainer> itr = ll.iterator();
		while(itr.hasNext()) {
			Trainer ta = itr.next();
		System.out.println(ta.getTname() + " " + ta.getCname());
		
		List<Student> all = ta.getStudent();
		Iterator<Student> itr2 = all.iterator();
			while(itr2.hasNext()) {
			Student stu = itr2.next();
				System.out.println(stu.getName() + " " + stu.getPhone() + " " + stu.getEmail());
			}
		}
		s.close();
	

	
}
	

}
