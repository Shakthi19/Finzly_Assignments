package com.control;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.finz.Student;

public class HibernateMain {
	static SessionFactory getSessionFactory() {
		Configuration cfg =new Configuration();
		cfg.addAnnotatedClass(Student.class);
		cfg.configure("hibernate.cfg.xml");
		return cfg.buildSessionFactory();
	}
public static void main(String[] args) {
	
	Session s=getSessionFactory().openSession();
	//Read
	Transaction t=s.beginTransaction();
	Student s1 = s.get(Student.class, 7);
	System.out.println(s1);
	t.commit();
	
	//Create
	
    Student s2 = new Student();
    s2.setId(17);
    s2.setName("Billa");
    s.save(s2);
    t.commit();
   
//  Update

    Student s3 = new Student();
    s3.setId(10);
    s3.setName("Ushaaa");
    s.update(s3);
    t.commit();

//   Delete

    Student s4 = new Student();
    s4.setId(3);
    s.delete(s4);
    t.commit();
    
    
	s.close();
}
}
