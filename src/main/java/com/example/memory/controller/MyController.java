package com.example.memory.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/xbk")
public class MyController {

    @RequestMapping("/hello")
    public String Hello(){
        return "Hello World";
    }
}
