package com.example.demoget.controller;

import com.example.demoget.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
@Controller
public class Demo {
    @Autowired
    JdbcTemplate jdbc;
    @PostMapping("/employees")
    public String employee(@RequestBody Employee employee)
    {
      jdbc.execute("insert into user(name,lname,id)");
        return"data inserted Successfully";

    }
}
