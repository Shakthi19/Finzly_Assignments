package com.common;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public final class hibernateConfig {
	
	private hibernateConfig() {
	}

	public static SessionFactory getSessionFactory() {

		Configuration cfg = new Configuration();
		cfg.configure("finzly.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		return sf;
	}

}
