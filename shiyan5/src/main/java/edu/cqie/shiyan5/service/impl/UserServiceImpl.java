package edu.cqie.shiyan5.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.cqie.shiyan5.entity.User;
import edu.cqie.shiyan5.service.UserService;
import edu.cqie.shiyan5.mapper.UserMapper;
import jakarta.annotation.Resource;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
* @author wenzhi gao
* @description 针对表【user】的数据库操作Service实现
* @createDate 2024-04-29 11:03:36
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{
    @Resource
    private UserMapper userMapper;
    @Override
    public User loadUserByUsername(String username,String password) throws UsernameNotFoundException {
        LambdaQueryWrapper<User> queryWrapper=new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getUsername,username);
        var user = userMapper.selectOne(queryWrapper);
        if(user==null){
            throw new UsernameNotFoundException("该用户在系统中不存在");
        }
        User users =  userMapper.selectByUsername(username);

        return user;
    }
}




