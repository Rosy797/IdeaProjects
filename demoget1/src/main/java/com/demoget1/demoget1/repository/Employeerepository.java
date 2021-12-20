package com.demoget1.demoget1.repository;

import com.demoget1.demoget1.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class Employeerepository {

    @Autowired
    JdbcTemplate jdbcTemplate;


    public void InsertNewDetailsToDatabase(Employee employee) {
        String sql = "insert into employee.Employee(name,lname,id) values(?,?,?)";
        Object[] params = new Object[]
                {
                         employee.getfirstName(), employee.getlastName(), employee.getid(),};
        jdbcTemplate.update(sql, params);
    }

}
