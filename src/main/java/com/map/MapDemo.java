package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {

		Configuration cf = new Configuration();
		cf.configure("hibernate.cfg.xml");

		SessionFactory factory = cf.buildSessionFactory();
		Session session = factory.openSession();

		// // question 1
		// Question q = new Question();
		// q.setQuestion("what is java ?");
		// q.setQuestionid(110);
		//
		// // answer
		//
		// Answer a1 = new Answer();
		// a1.setAnswerId(90);
		// a1.setAnswer("java is object oriented langauge");
		// a1.setQuestion(q);
		//
		// Answer a2 = new Answer();
		// a2.setAnswerId(40);
		// a2.setAnswer("java is portable lngauge");
		// a2.setQuestion(q);
		//
		// Answer a3 = new Answer();
		// a3.setAnswerId(60);
		// a3.setAnswer("java is high programing langauge");
		// a3.setQuestion(q);
		//
		//
		// List<Answer> list = new ArrayList<Answer>();
		// list.add(a1);
		// list.add(a2);
		// list.add(a3);
		//
		// q.setAnswers(list);

		Transaction tx = session.beginTransaction();
		// session.save(q);
		// session.save(a1);
		// session.save(a2);
		// session.save(a3);

		tx.commit();

		// fetch

		Question q =(Question) session.get(Question.class, 110);
		System.out.println(q.getQuestion());
		for (Answer answers : q.getAnswers()) {
			System.out.println(answers.getAnswer());

		}

		factory.close();
		session.close();

	}

}
