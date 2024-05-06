package com.example.springsecurity_demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MallController {
    @RequestMapping("/order/manage")
    @ResponseBody
    public String orderManage(){
        return "商城订单管理功能";
    }

    @RequestMapping("/shop/manage")
    @ResponseBody
    public String shopManage(){
        return "商城店铺管理功能";
    }

    @RequestMapping("/user/manage")
    @ResponseBody
    public String userManage(){
        return "商城系统用户管理功能";
    }
}
