package com.SpringJDBC.JdbcDemo.dao;

import com.SpringJDBC.JdbcDemo.model.Employee;
import com.SpringJDBC.JdbcDemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDao implements EmployeeRepository {

    @Autowired
    private JdbcTemplate template;

    @Override
    public List<Employee> getEmployeeList() {
        String sql = "select * from employee";
        List<Employee> eList = template.query(sql, new BeanPropertyRowMapper<>(Employee.class));
        return eList;
    }
}
