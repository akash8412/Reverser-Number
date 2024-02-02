package com.jbk.HProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		Configuration cf = new Configuration();
		cf.configure("hibernate.cfg.xml");

		SessionFactory Factory = cf.buildSessionFactory();
		Session session = Factory.openSession();
		Transaction tx = session.beginTransaction();

		Student student1 = new Student();
		student1.setsId(355);
		student1.setsName("ravi");
		student1.setsCity("beed");

		Certificate ser1 = new Certificate();

		ser1.setCourse("androide");
		ser1.setDuration("2 month");
		student1.setCerti(ser1);

		Student student2 = new Student();
		student2.setsId(799);
		student2.setsName("hitesh");
		student2.setsCity("jalna");

		Certificate ser2 = new Certificate();
		ser2.setCourse("androide1");
		ser2.setDuration("4 month");
		student2.setCerti(ser2);

		session.save(student1);
		session.save(student2);
		tx.commit();
		System.out.println("Record Inserted Sucessfully...........");

		Factory.close();
		session.close();

	}

}
