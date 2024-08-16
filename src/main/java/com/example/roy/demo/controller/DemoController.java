package com.example.roy.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

import com.example.roy.demo.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@ComponentScan(basePackages = "com.example.roy.demo.service", lazyInit = true)
public class DemoController {
    @Autowired
    DemoService demoService;
    
    @GetMapping("/")
    public String hello()
    {
        return demoService.getHello();
    }    
}
