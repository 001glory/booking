package com.cjd.booking;

import com.cjd.booking.dao.entity.User;
import com.cjd.booking.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = BookingApplication.class)
//public class BookingApplicationTests {
//
////    @Test
////    public void contextLoads() {
////    }
////
////    @Autowired
////    private UserMapper userMapper;
////
////    @Test
////    public void insert() {
////
////        User user = new User();
////
////        user.setId(13);
////        user.setUsername("judgchen");
////        user.setPassword("zxcvbnm123456");
////
////        userMapper.insert(user);
////
////        Assert.assertEquals(5,userMapper.getUserList().size());
////    }
//}
