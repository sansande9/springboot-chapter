package com.example.springsecurity_demo1.service.impl;



import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springsecurity_demo1.entity.RolePermission;
import com.example.springsecurity_demo1.mapper.RolePermissionMapper;
import com.example.springsecurity_demo1.service.RolePermissionService;
import org.springframework.stereotype.Service;

/**
* @author xy
* @description 针对表【role_permission】的数据库操作Service实现
* @createDate 2024-04-22 12:10:17
*/
@Service
public class RolePermissionServiceImpl extends ServiceImpl<RolePermissionMapper, RolePermission>
    implements RolePermissionService {

}




