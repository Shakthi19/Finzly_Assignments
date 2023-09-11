package com.control;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<Employee> getEmployeesWithSalaryGreaterThan(double salary) {
        Session currentSession = employeeDAO.getSessionFactory().getCurrentSession();
        Criteria criteria = currentSession.createCriteria(Employee.class);
        criteria.add(Restrictions.gt("salary", salary));
        return criteria.list();
    }

    @Override
    @Transactional
    public List<Employee> getEmployeesInDepartments(String... departments) {
        Session currentSession = employeeDAO.getSessionFactory().getCurrentSession();
        Criteria criteria = currentSession.createCriteria(Employee.class);
        criteria.add(Restrictions.in("department", departments));
        return criteria.list();
    }

    @Override
    @Transactional
    public List<Employee> getEmployeesNotInDepartment(String department) {
        Session currentSession = employeeDAO.getSessionFactory().getCurrentSession();
        Criteria criteria = currentSession.createCriteria(Employee.class);
        criteria.add(Restrictions.ne("department", department));
        return criteria.list();
    }

    @Override
    @Transactional
    public List<Employee> getEmployeesSortedBySalaryDescending() {
        Session currentSession = employeeDAO.getSessionFactory().getCurrentSession();
        Criteria criteria = currentSession.createCriteria(Employee.class);
        criteria.addOrder(org.hibernate.criterion.Order.desc("salary"));
        return criteria.list();
    }
}
