package com.map1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {

	public static void main(String[] args) {
		Configuration cf = new Configuration();
		cf.configure("hibernate.cfg.xml");

		SessionFactory factory = cf.buildSessionFactory();
		

		Emp e1 = new Emp();
		Emp e2 = new Emp();
		e1.setEid(123);
		e1.setEname("ram");
		
		e2.setEid(12);
		e2.setEname("sham");
		
		
		Project p1=  new Project();
		p1.setPid(87);
		p1.setPname("laibrary management system");
		
		
		
		Project p2=  new Project();
		p2.setPid(23);
		p2.setPname("College management");
		
		
		List<Emp> list1 = new ArrayList<Emp>();
		list1.add(e1);
		list1.add(e2);
		
		List<Project> list2 = new ArrayList<Project>();
		list2.add(p1);
		list2.add(p2);
		
		
		e1.setProjects(list2);
		p2.setEmps(list1);
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		
		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);
		
		
		
		
		tx.commit();
		factory.close();
		session.close();
		
		
		
		
		
		
		
	}

}
