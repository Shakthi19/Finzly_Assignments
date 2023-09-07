package com.Operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.common.hibernateConfig;
import com.entity.Employee;

public class Client {

	public static void main(String[] args) {

		SessionFactory sf = hibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Employee e1 = session.load(Employee.class, 1);
		System.out.println(e1);
	}
}
