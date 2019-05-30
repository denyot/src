package com.huxinfeng.ssh.service;

import com.huxinfeng.ssh.domain.Employee;

import java.util.List;

public interface IEmployeeService {
    void save(Employee employee);

    void delete(Employee employee);

    void update(Employee employee);

    Employee get(Long id);

    List<Employee> select();
}
