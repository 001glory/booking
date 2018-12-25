package com.cjd.booking.mapper;

import com.cjd.booking.dao.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    /**
     * 插入一条用户数据
     * @param user 用户信息
     */
    @Insert("INSERT INTO user(id,username,password) VALUES(#{id},#{username},#{password})")
    void insert(User user);

    /**
     * 通用户id获取用户
     * @param username 用户username
     * @return
     */
    @Select("SELECT username,password FROM user WHERE username=#{username}")
    User getUserByUsername(String username);

    /**
     * 获取所有用户信息
     * @return
     */
    @Select("SELECT *FROM user")
    List<User> getUserList();
}
