package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController
{

    @GetMapping("/hello")
    public String hello(String userName){

        return "JDdgjdrgnj "+ userName;
    }
}
