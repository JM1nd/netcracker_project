package com.spring.netcracker_project;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping
    public String helloWorld() {
        return "Hello world";
    }
 
    @RequestMapping("/goodbye")
    public String goodBye() {
        return "Goodbye";
    }
 }
