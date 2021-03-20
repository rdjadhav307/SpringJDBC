package com.SpringJDBC.JdbcDemo.repository;

import com.SpringJDBC.JdbcDemo.model.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> getEmployeeList();
}
