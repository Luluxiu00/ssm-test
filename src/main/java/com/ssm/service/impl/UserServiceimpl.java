package com.ssm.service.impl;

import com.ssm.mapper.UserMapper;
import com.ssm.pojo.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 326944 on 2017/7/12.
 */
@Service
public class UserServiceimpl implements UserService {

    @Autowired
    UserMapper userMapper;

    public User login(String username, String password) {
        return userMapper.login(username,password);
    }
}
