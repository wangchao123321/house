package com.wangchao.house.service;

import com.wangchao.house.common.model.User;
import com.wangchao.house.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> getUsers() {
        return userMapper.selectUsers();
    }
}
