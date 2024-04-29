package edu.cqie.springsecuruty.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.cqie.springsecuruty.entity.User;
import edu.cqie.springsecuruty.service.UserService;
import edu.cqie.springsecuruty.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author wenzhi gao
* @description 针对表【user】的数据库操作Service实现
* @createDate 2024-04-28 11:04:17
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




