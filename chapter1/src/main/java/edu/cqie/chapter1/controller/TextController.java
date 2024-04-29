package edu.cqie.chapter1.controller;

import edu.cqie.chapter1.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TextController {
    @Autowired
    private Userservice userservice;

    @ResponseBody
    public String Text1(){
//        保存一个用户
        return userservice.save();
    }
    @ResponseBody
    public String Text2(){
//        更新一个用户
        return userservice.update();
    }
}
