package com.example.roy.demo.repository;

import org.springframework.stereotype.Component;

@Component
public class UserRepositoryImpl implements UserRepository {
    public String userName()
    {
        return "roy";
    }
}
