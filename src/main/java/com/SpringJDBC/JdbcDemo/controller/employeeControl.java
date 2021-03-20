package com.SpringJDBC.JdbcDemo.controller;

import com.SpringJDBC.JdbcDemo.dao.EmployeeDao;
import com.SpringJDBC.JdbcDemo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class employeeControl {

    @Autowired
    private EmployeeDao ed;

    @GetMapping("/getlist")
    public List<Employee> getList()
    {
        return ed.getEmployeeList();
    }

}
