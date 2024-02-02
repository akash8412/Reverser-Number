package com.jbk.HProject;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		System.out.println("Hello World!");
		Configuration cf = new Configuration();
		cf.configure("hibernate.cfg.xml");
		SessionFactory Factory = cf.buildSessionFactory();
		Student st = new Student();

		st.setsId(1);

		st.setsName("rahul");

		st.setsCity("delhi");

		Address ad = new Address();
		ad.setAstreet("street2");
		ad.setAcity("kanpur");
		ad.setOpen(true);
		ad.setAddeddate(new Date());
		ad.setX(12.87);
		FileInputStream fs = new FileInputStream("src/main/java/mob.png");
		byte[] data = new byte[fs.available()];
		fs.read(data);
		ad.setAimage(data);

		Session session = Factory.openSession();

		Transaction bt = session.beginTransaction();

		session.save(st);
		session.save(ad);
		System.out.println("done......");

		bt.commit();
		session.close();

	}
}
