package com.Operation;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.common.hibernateConfig;
import com.entity.Employee;

public class Client3 {

	public static void main(String[] args) {

		SessionFactory sf = hibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		List<Employee> list = criteria.list();
		for (Employee employee : list) {
			System.out.println(employee);
		}
	}
}
