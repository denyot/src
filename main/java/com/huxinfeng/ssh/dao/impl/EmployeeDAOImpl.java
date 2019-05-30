package com.huxinfeng.ssh.dao.impl;

import com.huxinfeng.ssh.dao.IEmployeeDAO;
import com.huxinfeng.ssh.domain.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements IEmployeeDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Employee employee) {
        //CurrentSession必须要事务支持
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.save(employee);
    }

    @Override
    public void delete(Employee employee) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.delete(employee);
    }

    @Override
    public void update(Employee employee) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.update(employee);
    }

    @Override
    public Employee get(Long id) {
        Session currentSession = sessionFactory.getCurrentSession();
        return (Employee) currentSession.get(Employee.class, id);
    }

    @Override
    public List<Employee> select() {
        Session currentSession = sessionFactory.getCurrentSession();
        return currentSession.createQuery("select e from Employee e").list();
    }
}
