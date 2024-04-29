package edu.cqie.springsecuruty.service.impl;



import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import  edu.cqie.springsecuruty.entity.Permission;
import  edu.cqie.springsecuruty.service.PermissionService;
import  edu.cqie.springsecuruty.mapper.PermissionMapper;
import edu.cqie.springsecuruty.entity.Permission;
import edu.cqie.springsecuruty.mapper.PermissionMapper;
import edu.cqie.springsecuruty.service.PermissionService;
import org.springframework.stereotype.Service;

/**
* @author wenzhi gao
* @description 针对表【permission】的数据库操作Service实现
* @createDate 2024-04-28 11:20:21
*/
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission>
    implements PermissionService {

}




