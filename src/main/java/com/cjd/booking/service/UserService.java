package com.cjd.booking.service;

import com.cjd.booking.dao.entity.User;
import com.cjd.booking.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    /**
     * 插入一条用户数据
     * @param user 用户信息
     */
    void insert(User user);

    /**
     * 通用户id获取用户
     * @param username 用户username
     * @return
     */
    User getUserByUsername(String username);

    /**
     * 获取所有用户信息
     * @return
     */
    List<User> getUserList();
}
