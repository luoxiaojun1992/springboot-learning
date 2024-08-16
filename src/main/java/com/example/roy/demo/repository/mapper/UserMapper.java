package com.example.roy.demo.repository.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.roy.demo.entity.User;

@Mapper
public interface UserMapper {
    @Select("select * from user where name = #{name}")
    public User getUserByName(@Param("name") String name);
}
