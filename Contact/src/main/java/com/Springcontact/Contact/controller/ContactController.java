package com.Springcontact.Contact.controller;



import java.util.List;

import com.Springcontact.Contact.model.Contacts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ContactController {



    @GetMapping("/contacts")
    public List<Contacts> findAll() {
        return findAll();
    }

    @GetMapping ("/contacts/{phoneno}")
 public String   findByPhoneno(@PathVariable int phoneno) {
        return findByPhoneno(phoneno);
    }

    @DeleteMapping("/contacts/{phoneno}")
    public String deleteByPhone(@PathVariable int phoneno) {
        return " Contact(s) delete from the database";
    }

    @PostMapping("/contacts")
    public String save(@RequestBody Contacts c) {
        return "Contact(s) saved successfully";
    }



}