package com.jbk.HProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		Configuration cf = new Configuration();
		cf.configure().addAnnotatedClass(Student.class);
		SessionFactory factory = cf.buildSessionFactory();
		Session session = factory.openSession();
		Student student1 = session.get(Student.class, 2);
		Student student2 = session.get(Student.class, 2);

		System.out.println(student1);
		
		System.out.println(student2);
		
		
		
		
		
		factory.close();
		
		session.close();
		

	}

}
