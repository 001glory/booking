package com.cjd.booking.service.impl;

import com.cjd.booking.dao.entity.User;
import com.cjd.booking.mapper.UserMapper;
import com.cjd.booking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void insert(User user) {
        userMapper.insert(user);
    }

    @Override
    public User getUserByUsername(String username) {
        return userMapper.getUserByUsername(username);
    }

    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }
}
