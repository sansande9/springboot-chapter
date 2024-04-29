package edu.cqie.springthymeleaf.controller;

import edu.cqie.springthymeleaf.entity.User;
import edu.cqie.springthymeleaf.service.UserListService;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@Controller
public class UserListController {
    @Resource
    public UserListService userListService;
    @RequestMapping("/userlist")
    public String userList(Model model) {
        List<User> userList = userListService.getUserList();
       model.addAttribute("userList", userList);
        return "/userList";
    }

}
