package edu.cqie.shiyan5.controller;

import edu.cqie.shiyan5.entity.User;
import edu.cqie.shiyan5.service.UserDetailsService;
import edu.cqie.shiyan5.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
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

}
