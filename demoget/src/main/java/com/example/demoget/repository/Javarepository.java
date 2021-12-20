package com.example.demoget.repository;
import com.example.demoget.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.sql.*;
@Repository
public class Javarepository {

    @Autowired
    JdbcTemplate jdbcTemplate;


    public void InsertNewDetailsToDatabase(Employee employee) {
        String sql = "insert into Employee.employee(id,name,lname) values(?,?,?)";
        Object params[] = new Object[]
                {
                    Employee.getId(), Employee.getFirstName(), Employee.getLastName()};
        jdbcTemplate.update(sql, params);
    }
}

