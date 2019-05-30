package com.huxinfeng.ssh.service.Impl;

import com.huxinfeng.ssh.domain.Employee;
import com.huxinfeng.ssh.service.IEmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class EmployeeServiceImplTest {
    @Autowired
     IEmployeeService service;
    @Autowired
     Employee employee;

    @Test
    public void save() throws Exception {
        employee.setName("胡心烽");
        employee.setAge(18);
        service.save(employee);
    }

    @Test
    public void delete() throws Exception {
    }

    @Test
    public void update() throws Exception {
    }

    @Test
    public void get() throws Exception {
    }

    @Test
    public void select() throws Exception {
    }
}