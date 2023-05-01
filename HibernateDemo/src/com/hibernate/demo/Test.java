package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();

		cfg.configure("hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		Transaction t = s.beginTransaction();

		Employee em = new Employee();
		em.setName("prajwal");
		em.setFname("jagtap");

		s.save(em);

		t.commit();

		s.close();

	}

}
