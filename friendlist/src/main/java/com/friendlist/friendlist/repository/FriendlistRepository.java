package com.friendlist.friendlist.repository;

import java.beans.BeanProperty;

import com.friendlist.friendlist.model.Friend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

@Repository
public class FriendlistRepository {
    
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void insertNewFriendToDatabase(String firstname, String lastname) {
        String sql = "INSERT INTO friend(firstname,lastname) VALUES(?,?)";
        Object params[] = new Object[] {firstname, lastname };
        jdbcTemplate.update(sql,params);
        System.out.println("Friend sucessfully added!");
    }

    public Friend getFriendFromDatabase(int id) {
        String sql = "SELECT * FROM friend WHERE id = ?";
        Object params[] = new Object[] {id};
        return jdbcTemplate.queryForObject(sql, params, BeanPropertyRowMapper.newInstance(Friend.class));
    }

}