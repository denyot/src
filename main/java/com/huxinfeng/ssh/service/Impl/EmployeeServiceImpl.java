package com.huxinfeng.ssh.service.Impl;

import com.huxinfeng.ssh.dao.IEmployeeDAO;
import com.huxinfeng.ssh.domain.Employee;
import com.huxinfeng.ssh.service.IEmployeeService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private IEmployeeDAO employeeDAO;

    @Override
    public void save(Employee employee) {
        employeeDAO.save(employee);
    }

    @Override
    public void delete(Employee employee) {
        employeeDAO.delete(employee);
    }

    @Override
    public void update(Employee employee) {
        employeeDAO.update(employee);
    }

    @Override
    public Employee get(Long id) {
        return employeeDAO.get(id);
    }

    @Override
    public List<Employee> select() {
        return employeeDAO.select();
    }
}
