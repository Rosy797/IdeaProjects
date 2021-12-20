package com.springproject2.springproject2.repository;

import org.springframework.web.bind.annotation.GetMapping;

public class JavaRepository {
    @GetMapping
    public BookModel searchBookInDatabase(String title){
        String sql="select * from BookApi.book where title = ? ";
        Object params[] = new Object[] {title};
        return jdbcTemplate.queryForObject(sql,params, BeanPropertyRowMapper.newInstance(BookModel.class));
    }
}
