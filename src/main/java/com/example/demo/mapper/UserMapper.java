package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public abstract class UserMapper {
    public abstract List<User> findAllUser();

    public abstract List<User> findUserByUserId(int userid);
}
