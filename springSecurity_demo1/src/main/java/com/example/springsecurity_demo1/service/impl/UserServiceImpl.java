package com.example.springsecurity_demo1.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springsecurity_demo1.entity.User;
import com.example.springsecurity_demo1.mapper.UserMapper;
import com.example.springsecurity_demo1.service.UserService;
import org.springframework.stereotype.Service;

/**
* @author xy
* @description 针对表【user】的数据库操作Service实现
* @createDate 2024-04-22 12:10:17
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {

}




