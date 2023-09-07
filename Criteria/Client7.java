package com.Operation;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.common.hibernateConfig;
import com.entity.Employee;

public class Client7 {

	public static void main(String[] args) {

		SessionFactory sf = hibernateConfig.getSessionFactory();
		Session session = sf.openSession();

		Query query = session.createQuery("from Employee");
		List<Employee> e = query.list();
		
		for (Employee employee : e) {
			System.out.println(employee);
		}
	}
}
