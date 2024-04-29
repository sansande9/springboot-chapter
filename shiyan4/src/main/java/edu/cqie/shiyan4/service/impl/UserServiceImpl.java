package edu.cqie.shiyan4.service.impl;

import edu.cqie.shiyan4.entity.User;
import edu.cqie.shiyan4.mapper.UserMapper;
import edu.cqie.shiyan4.service.UserService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.function.UnaryOperator;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User queryByname(String username) {
        return userMapper.queryByname(username);
    }


}
