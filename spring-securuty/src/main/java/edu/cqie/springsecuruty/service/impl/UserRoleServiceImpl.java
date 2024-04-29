package edu.cqie.springsecuruty.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import edu.cqie.springsecuruty.entity.UserRole;
import edu.cqie.springsecuruty.service.UserRoleService;
import edu.cqie.springsecuruty.mapper.UserRoleMapper;
import org.springframework.stereotype.Service;

/**
* @author wenzhi gao
* @description 针对表【user_role】的数据库操作Service实现
* @createDate 2024-04-28 11:11:08
*/
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole>
    implements UserRoleService{

}




