package com.Operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.common.hibernateConfig;
import com.entity.Employee;

public class Client2 {

	public static void main(String[] args) {

		SessionFactory sf = hibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Employee e = new Employee();
		e.setId(5);
		e.setName("shakthi");
		e.setSalary("70000");
		e.setProfile("Dev");
		 session.save(e);
		 tr.commit();
		System.out.println("Done");
	}
}
