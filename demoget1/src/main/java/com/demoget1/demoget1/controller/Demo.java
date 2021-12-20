package com.demoget1.demoget1.controller;

import com.demoget1.demoget1.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.sql.*;
@Controller
    public class Demo {
    @Autowired
       JdbcTemplate jdbcTemplate;
       @RequestMapping(value = "/employees")

        public String employee()
    {
        jdbcTemplate.execute ("insert into employee(name,lname,id)");
        return"data inserted Successfully";

    }
@PostMapping("/added")
    public Employee showEmployee(@RequestBody Employee employee)
{
    System.out.println("Employee :"+ employee);
    return  employee;
}
}


