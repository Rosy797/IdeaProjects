package com.springproject2.springproject2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

@RestController
public class DemoController {

    @GetMapping(path = "/hi")
    public String hi() {
        return "hello world";
    }

    @GetMapping(path = "/")
    public String root() {
        return "hello";
    }

    @GetMapping(path = "/param")
    public String getParam(@RequestParam String name) {
        System.out.println("\n\n\n\n\n\n");
        System.out.println(name);
        String response = "hi" + name;
        return response;
    }
    @PostMapping(path="/api/postmaster")
    public String  postParam(WebRequest webrequest)
    {
        String name=webrequest.getParameter("name");
        String lname=webrequest.getParameter("lname");
        String response="hi"+name+" "+lname;
        return response;
    }
}


