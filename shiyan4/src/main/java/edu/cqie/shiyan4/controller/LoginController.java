package edu.cqie.shiyan4.controller;

import edu.cqie.shiyan4.entity.User;
import edu.cqie.shiyan4.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;


    @RequestMapping("/login")
    public String login(){
        return "/login";
    }

    @PostMapping("/Dologin")
    public String userlist(String username, String password, HttpSession session){

        User user = userService.queryByname(username);
        session.setAttribute("User", user);
        if(password.equals(user.getPassword())) {
        return "redirect:userCenter";
        }
        return "/loginfail";
    }
    @RequestMapping("userCenter")
    public String userCenter(User user){
        if(user.getRole().equals("vip")){
            return "vip";
        } else if (user.getRole().equals("manager")) {
            return "manager";
        }
           return "common";
    }


}
