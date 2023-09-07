package com.Operation;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.common.hibernateConfig;
import com.entity.Employee;

public class Client6 {

	public static void main(String[] args) {

		SessionFactory sf = hibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.setProjection(Projections.avg("Salary"));

		List<Employee> e = criteria.list();

		System.out.println(e);
	}
}
