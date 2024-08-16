package com.example.roy.demo.repository;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.roy.demo.entity.User;
import com.example.roy.demo.repository.mapper.UserMapper;

@Component
@MapperScan(basePackages = "com.example.roy.demo.repository.mapper", lazyInitialization = "true", annotationClass = Mapper.class)
public class UserRepositoryImpl implements UserRepository {
    @Autowired
    UserMapper userMapper;
    
    public User getUserByName(String name) {
        return userMapper.getUserByName(name);
    }
}
