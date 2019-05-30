package com.huxinfeng.ssh.dao;

import com.huxinfeng.ssh.domain.Employee;

import java.util.List;

public interface IEmployeeDAO {
    void save(Employee employee);

    void delete(Employee employee);

    void update(Employee employee);

    Employee get(Long id);

    List<Employee> select();
}
