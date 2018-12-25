package com.cjd.booking.controller;

import com.cjd.booking.dao.entity.User;
import com.cjd.booking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {



    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String showReg(){
        System.out.println("太符合符合规范");
        return "reg";
    }


    @PostMapping("/reg")
    public String register(User user){
        userService.insert(user);
        return "redirect:/user/showLogin";
    }

    @RequestMapping("/showLogin")
    public String showLogin(){
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Map<String,Object> model){
        User user = userService.getUserByUsername(username);

//        System.out.println("测试");
        System.out.println("dsdsad"+user.getPassword());
        System.out.println(password);
//        return "ok";
        if(password.equals(user.getPassword())){
            model.put("msg","登录成功！！！");
            System.out.println("测试");
            return "ok";
        }else {
            System.out.println("有毒");
            return "redirect:/user/index";
        }
    }

}
