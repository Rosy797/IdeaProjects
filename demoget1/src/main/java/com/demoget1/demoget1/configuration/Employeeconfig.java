package com.demoget1.demoget1.configuration;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


@Configuration
public class Employeeconfig {
    @Value("${spring.datasource.url}")
    String url;
    @Value("${spring.datasource.username}")
    String username;
    @Value("${spring.datasource.password}")
    String pass;

    @Bean
    public Connection connection() throws SQLException {

        Connection con = DriverManager.getConnection(url, username, pass);
        return con;
    }
}