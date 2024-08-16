package com.example.roy.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.example.roy.demo.config.AppConfig;
import com.example.roy.demo.entity.User;
import com.example.roy.demo.repository.UserRepository;

@Component
@ComponentScan(basePackages = "com.example.roy.demo.repository", lazyInit = true)
public class DemoServiceImpl implements DemoService {
    @Autowired
    AppConfig appConfig;

    @Autowired
    UserRepository userRepository;
    public String getHello() {
        User user = userRepository.getUserByName("roy");
        return String.format("Hello %s! Welcome to the world of SpringBoot App %s!", user.getName(), appConfig.getName());
    }
}
