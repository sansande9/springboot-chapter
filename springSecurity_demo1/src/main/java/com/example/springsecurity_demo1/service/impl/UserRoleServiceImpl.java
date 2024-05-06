package com.example.springsecurity_demo1.service.impl;



import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springsecurity_demo1.entity.UserRole;
import com.example.springsecurity_demo1.mapper.UserRoleMapper;
import com.example.springsecurity_demo1.service.UserRoleService;
import org.springframework.stereotype.Service;

/**
* @author xy
* @description 针对表【user_role】的数据库操作Service实现
* @createDate 2024-04-22 12:10:17
*/
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole>
    implements UserRoleService {

}




