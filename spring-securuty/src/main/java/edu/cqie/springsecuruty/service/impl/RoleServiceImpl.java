package edu.cqie.springsecuruty.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.cqie.springsecuruty.entity.Role;
import edu.cqie.springsecuruty.mapper.RoleMapper;
import edu.cqie.springsecuruty.service.RoleService;
import org.springframework.stereotype.Service;

/**
* @author wenzhi gao
* @description 针对表【role】的数据库操作Service实现
* @createDate 2024-04-28 11:20:21
*/
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role>
    implements RoleService {

}




