package com.example.springsecurity_demo1.controller;

import com.example.springsecurity_demo1.entity.User;
import com.example.springsecurity_demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/login")
    public String loginPage(){
        return "login";
    }

    @RequestMapping("/loginFail")
    public String loginFail(){
        return "loginFail";
    }

    @RequestMapping("/main")
    public String main(){
        return "main";
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }

    @PostMapping("/register")
    public String register(String username, String password){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        User user = new User();
        user.setUsername(username);
        user.setPassword(passwordEncoder.encode(password));//密码加密
        boolean row = userService.save(user);
        System.out.println(row);

        if (row){
            return "redirect:/user/login";
        }else {
            return "redirect:/user/register";
        }


    }
}