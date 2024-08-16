package com.example.roy.demo.repository;

import org.springframework.stereotype.Component;

import com.example.roy.demo.entity.User;

@Component
public interface UserRepository {
    public User getUserByName(String name);
}
