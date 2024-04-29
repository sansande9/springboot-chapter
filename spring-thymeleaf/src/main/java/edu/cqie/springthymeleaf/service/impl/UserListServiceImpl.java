package edu.cqie.springthymeleaf.service.impl;

import edu.cqie.springthymeleaf.entity.User;
import edu.cqie.springthymeleaf.mapper.UserListMapper;
import edu.cqie.springthymeleaf.service.UserListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class UserListServiceImpl implements UserListService {
    @Autowired
    private UserListMapper userListMapper;
    @Override
    public List<User> getUserList(){
        return userListMapper.getUserList();
    }
}
