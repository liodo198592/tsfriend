package com.zhouyu.dmutex.service;

import com.zhouyu.dmutex.dbconfig.config1.mapper.UserMapper1;
import com.zhouyu.dmutex.dbconfig.config2.mapper.UserMapper2;
import com.zhouyu.dmutex.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserMapper1 userMapper1;
    @Autowired
    private UserMapper2 userMapper2;

    @Transactional
    public void addUser(User user)throws Exception{
        userMapper2.addUser(user.getName(),user.getAge());
        userMapper1.addUser(user.getName(),user.getAge());
    }
}